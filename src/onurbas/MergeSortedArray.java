package onurbas;

public class MergeSortedArray {
  /*
   * nums1 ve nums2 sorted arrayler. gelen nums1 arrayi elemanları ve nums2 nin lenghti kadar yani n kadar 0 la gelecek
   *  örneğin n=3 için nums 1 arrayi 1 2 3 4 0 0 0...
   * ancak m nums1 arrayinin length i değil 0 olmayan eleman sayısı.
   * buna göre nums1 arrayini nums2 arrayi ile sıralı bir şekilde birleştir ve nums1 arrayinin üstüne yaz
   *
   *
   * Çözüm:Sondan başlayarak arraylerin elemanlarını karşılaştır.hangisi büyükse onu yaz ve bir önceki indexe geç ve tekrar kıyasla
   * Baştan başlamak nums1deki sayıları değiştirir sondan başla
   * nums1 arrayinde n kadar 0 olacağı için koşul nums2 arrayinin indexi 0dan küçük olmaması olmalıki 0 harici sayılarla çakışma olmasın */

  public void merge(int[] nums1,int m,int[] nums2,int n) {
	int nums1LastIndex = m - 1;
	int nums2LastIndex = n - 1;
	int mergeArrayLastIndex = m + n - 1;
	while (nums2LastIndex >= 0) {
	  if (nums1LastIndex >= 0 && nums1[nums1LastIndex] > nums2[nums2LastIndex]) {
		nums1[mergeArrayLastIndex] = nums1[nums1LastIndex];
		nums1LastIndex--;
	  } else {
		nums1[mergeArrayLastIndex] = nums2[nums2LastIndex];
		nums2LastIndex--;
	  }
	  mergeArrayLastIndex--;
	}
  }
}
