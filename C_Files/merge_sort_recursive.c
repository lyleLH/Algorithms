#include <stdio.h>

#define AR_SIZE( a ) sizeof( a ) / sizeof( a[0] )

void merge_sort_recursive(int arr[], int reg[], int start, int end) {
	if (start >= end)
		return;
	int len = end - start, mid = (len >> 1) + start;
	int start1 = start, end1 = mid;
	int start2 = mid + 1, end2 = end;
	merge_sort_recursive(arr, reg, start1, end1);
	merge_sort_recursive(arr, reg, start2, end2);
	int k = start;
	while (start1 <= end1 && start2 <= end2)
		reg[k++] = arr[start1] < arr[start2] ? arr[start1++] : arr[start2++];
	while (start1 <= end1)
		reg[k++] = arr[start1++];
	while (start2 <= end2)
		reg[k++] = arr[start2++];
	for (k = start; k <= end; k++)
		arr[k] = reg[k];
}
void merge_sort(int arr[], const int len) {
	int reg[len];
	merge_sort_recursive(arr, reg, 0, len - 1);
}

int main(void){
	int arr[] = {1,23,41,41,2,1241,14,677,7,575,46554,998,43,423423,5,3,463,6,76,4};
	int length = AR_SIZE(arr);
	merge_sort(arr,length);
	printf("数组的长度为：%ld \n",length);
	for(int i = 0 ; i <length;i ++){
		printf("%ld \n",arr[i]);
	}
	return 0; 
}