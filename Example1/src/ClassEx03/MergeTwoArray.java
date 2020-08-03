package ClassEx03;

import java.util.Arrays;

public class MergeTwoArray {

	public static void main(String[] args) {
		// 연습문제 3. 심플 배열 병함 (하나로 합치기)
		// 배열 생성
		int[] evens = {0, 2, 4, 6, 8};
		int[] odds = {1, 3, 5, 7, 9};
		
		//배열 병함
		int[] result = merge(evens, odds);
		Arrays.sort(result);
		
		//결과 출력
		System.out.printf("결과: ");
		for(int i = 0; i < result.length; i++) {
			System.out.printf("%d ", result[i]);
		}
	}
	// 두 배열을 입력받아, 하나로 된 새 배열을 반환
	public static int[] merge(int[] arr1, int[] arr2) {
		int[] mergedArr = new int[arr1.length+arr2.length];
		
		for(int i = 0; i<mergedArr.length; i++) {
			/*규칙성을 파악하여 해당 반복문을 완성하세요*/
			if(i<arr1.length) {
				mergedArr[i] = arr1[i];
			}else {
				mergedArr[i]=arr2[i-arr1.length];
			}
		}
		return mergedArr;
		}
	}
