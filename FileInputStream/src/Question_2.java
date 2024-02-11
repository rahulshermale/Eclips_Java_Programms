
public class Question_2 {
public static void main(String[] args) {
	System.out.println(10/0);
}
}
int[] array1 = {1, 2, 3, 4, 5};
int[] array2 = {4, 5, 6, 7, 8};

// Use a HashSet to store the elements of the first array
Set<Integer> setArray1 = new HashSet<Integer>();
for (int i = 0; i < array1.length; i++) {
    setArray1.add(array1[i]);
}

// Loop through the elements of the second array
for (int i = 0; i < array2.length; i++) {
    // Check if the element is in the set of the first array
    if (setArray1.contains(array2[i])) {
        // If it is, print the element
        System.out.println(array2[i]);
    }
}
