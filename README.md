# Insertion Sort

**Insertion Sort** is a sorting algorithm that uses one part of the array to hold the *sorted values* and the other
part of the array to hold values that are *not sorted yet*.

The algorithm takes one value at a time from the unsorted part of the array and puts it into the right place in the
sorted array, until the array is sorted.

## Algorithm

1) Take the first value from the unsorted part of the array
2) Move the value into the correct place in the sorted part of the array
3) Go through the unsorted part of the array again as many times as there are values

To find an in depth example, look in the PDF.

### Implementation

1. Start with an array to sort
2. An outer loop that picks a value to be sorted. For an array of $n$ values, this outer loop skips the first value, 
and must run $n-1$ times
3. An inner loop that goes through the sorted part of the array, to find where to insert the value. If the value is 
sorted at index $i$, the sorted part of the array starts at index $0$ and ends at index $i-1$

**Note:** There is a way to improve Insertion Sort by doing both the shifting and finding the right position 
simultaneously. Look in the PDF for the psuedocode or the code in the source files.

## Time Complexity

The worst case of Insertion Sort is when the array is sorted in descending order. This means that every new value must
"move through" the whole sorted part.

We get a time complexity of $O(n^2)$. Look in the PDF for a more in-depth explanation.
