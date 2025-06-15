#include <stdio.h>

#include <stdlib.h>

#include <string.h>

typedef struct BoundedArray

{

int SIZE;

char **words;

} boundedArray;

4 boundedArray getEvenLengthwords(char str[])

{

int ind 0;

boundedArray result (boundedArray )malloc(sizeof(boundedArray))

result SIZE;

result words (char*)malloc(zσαν (char) 100);

char token strtok(str," ");

winsie (token=NULL) {

(strlen(token)%2==0){

result words[ind) (char)malloc(sizeof(char) 100);

result words [ind] token;

} token strtok(NULL," ");

}

result SIZE ind;

SF(ind=0){

result words[0] (char)malloc(sizeof(char) 1);

result words[result->SIZE++]="-1";

}

return result;

}

int main()

char str[1001];

scanf("%[^\n]", str);

boundedArray "bArr = getEvenLengthwords(str);

for(int indexe; index < barr->SIZE; index++)

}

printf("Even Length Words: \n");

printf("%s\n", bArr->words[index]);

return 0;

}
/*
  typedef struct BoundedArray.

{

int SIZE;

char **words;

} boundedArray;

IMPORTANT: Do not write the main() function as it is already defined.

Example Input/Output 1:

Input

number one two four five eight eleven

Output:

Even Length Words:

number

four

five

eleven

Explanation:

Here the given string is number one two four five eight eleven.

The even length words in the string are given below.

number

four

five

eleven

Example Input/Output 2:

Input:

tiger biscuit water

Output:

Even Length Words:

-1

Max Execution Time Limit: 50 millisecs
*/
