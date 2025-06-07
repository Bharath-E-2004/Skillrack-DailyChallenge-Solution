#include <stdio.h>
#include <stdlib.h>
#include <string.h>

void findTotalMarks(const char *filename1, const char *filename2)
{
    FILE *fp1 = fopen(filename1, "r");
    FILE *fp2 = fopen(filename2, "r");

    if (!fp1 || !fp2) {
        printf("Error opening input files.\n");
        return;
    }

    char names[100][31];
    int marks[100], count = 0;

    // Reading names from filename1
    while (fgets(names[count], sizeof(names[count]), fp1)) {
        names[count][strcspn(names[count], "\r\n")] = '\0'; // Remove newline
        count++;
    }
    fclose(fp1);

    // Reading marks from filename2
    for (int i = 0; i < count; i++) {
        int a, b, c;
        if (fscanf(fp2, "%d %d %d", &a, &b, &c) != 3) {
            printf("Error reading marks for student %d.\n", i + 1);
            marks[i] = 0;
        } else {
            marks[i] = a + b + c;
        }
    }
    fclose(fp2);

    // Writing names and total marks to filename1
    fp1 = fopen(filename1, "w");
    if (!fp1) {
        printf("Error opening output file.\n");
        return;
    }

    for (int i = 0; i < count; i++) {
        fprintf(fp1, "%s %d\n", names[i], marks[i]);
    }
    fclose(fp1);
}

void printFileContent(const char *filename)
{
    FILE *fp = fopen(filename, "r");
    if (!fp) {
        printf("Error opening file to read.\n");
        return;
    }

    char ch;
    while ((ch = fgetc(fp)) != EOF) {
        printf("%c", ch);
    }
    fclose(fp);
}

int main()
{
    char filename1[100] = "names.txt";   // This file should contain one name per line
    char filename2[100] = "marks.txt";   // This file should contain three marks per line

    findTotalMarks(filename1, filename2);
    printf("Updated file content:\n");
    printFileContent(filename1);

    return 0;
}

/*
   Example Input/Output 1:

Input

students2021.txt

marks2021.txt

Output

Students and Total Marks:

Hector 190

Catherine 209

Anitha 262

Pravin 255

Explanation:

Here students2021.txt is present in the same folder where the program executes and the file contains the following 4 lines.

Hector

Catherine

Anitha

Pravin

Here marks2021.txt is present in the same folder where the program executes and the file contains the following 4 lines.

40 90 60

54 60 95

90 85 87

87 99 69
 */
