# 📚 MergeSort Implementation in Java

This project implements the classic **Merge Sort** algorithm in Java — an efficient, stable, and comparison-based sorting technique that uses the **divide-and-conquer** paradigm.

---

## 🔍 What is Merge Sort?

Merge Sort works by recursively splitting the array into halves, sorting each half, and **merging** the sorted halves back together. It’s known for its predictable time complexity and consistent performance.

---

## 🧠 Key Concepts

- **Divide**: The array is divided into two halves.
- **Conquer**: Each half is sorted recursively.
- **Merge**: Two sorted halves are merged into a single sorted array.

---

## 🔧 How the Merge Works

The `merge()` function takes two sorted subarrays (`start` to `mid`, and `mid+1` to `end`) and:
1. Creates a temporary array `temp[]` to store the merged result.
2. Uses two pointers to compare elements from each half.
3. Appends the smaller element to `temp[]` and moves the pointer.
4. Once one half is exhausted, the remaining elements from the other half are copied.
5. The `temp[]` array is then copied back into the original array.
# 📈 Time & Space Complexity

| Case    | Time Complexity | Space Complexity |
|---------|------------------|------------------|
| Best    | O(n log n)       | O(n)             |
| Average | O(n log n)       | O(n)             |
| Worst   | O(n log n)       | O(n)             |

---

### 🧠 Key Notes

- **Merge Sort guarantees O(n log n)** time complexity in all cases.
- Requires **extra space O(n)** due to the use of a temporary array during the merge step.
- It is a **stable** and **comparison-based** sorting algorithm.
