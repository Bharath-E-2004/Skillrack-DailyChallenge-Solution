#include <stdio.h>
#include <stdlib.h>
#include <string.h>

void sortAndSplitWords(char *filename, char *file2name) {
    char words[100][51];
    int count = 0;
    FILE *fp;

    // Read words from the first file
    fp = fopen(filename, "r");
    if (fp == NULL) {
        printf("Cannot open file %s\n", filename);
        return;
    }
    while (fscanf(fp, "%s", words[count]) != EOF) {
        count++;
    }
    fclose(fp);

    // Read words from the second file
    fp = fopen(file2name, "r");
    if (fp == NULL) {
        printf("Cannot open file %s\n", file2name);
        return;
    }
    while (fscanf(fp, "%s", words[count]) != EOF) {
        count++;
    }
    fclose(fp);

    // Sort all words
    for (int i = 0; i < count - 1; i++) {
        for (int j = i + 1; j < count; j++) {
            if (strcmp(words[i], words[j]) > 0) {
                char temp[51];
                strcpy(temp, words[i]);
                strcpy(words[i], words[j]);
                strcpy(words[j], temp);
            }
        }
    }

    // Write first half to file1
    int half = count / 2;
    fp = fopen(filename, "w");
    if (fp == NULL) {
        printf("Cannot write to file %s\n", filename);
        return;
    }
    for (int i = 0; i < half; i++) {
        fprintf(fp, "%s", words[i]);
        if (i != half - 1)
            fprintf(fp, "\n");
    }
    fclose(fp);

    // Write second half to file2
    fp = fopen(file2name, "w");
    if (fp == NULL) {
        printf("Cannot write to file %s\n", file2name);
        return;
    }
    for (int i = half; i < count; i++) {
        fprintf(fp, "%s", words[i]);
        if (i != count - 1)
            fprintf(fp, "\n");
    }
    fclose(fp);
}

void printFileContent(char *fileName) {
    FILE *fp = fopen(fileName, "r");
    if (fp == NULL) {
        printf("Cannot open file %s\n", fileName);
        return;
    }

    char ch;
    while ((ch = fgetc(fp)) != EOF) {
        printf("%c", ch);
    }

    fclose(fp);
}

int main() {
    char filename[51], file2name[51];
    scanf("%s\n%s", filename, file2name);

    sortAndSplitWords(filename, file2name);

    printf("%s:\n", filename);
    printFileContent(filename);

    printf("\n%s:\n", file2name);
    printFileContent(file2name);

    return 0;
}
