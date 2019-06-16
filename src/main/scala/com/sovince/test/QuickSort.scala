package com.sovince.test

/**
  * Created by vince
  * Email: so_vince@outlook.com
  * Data: 2019/6/13
  * Time: 21:03
  * Description:
  */
object QuickSort {

  def main(args: Array[String]): Unit = {
    val arr = Array(99,111,1,33,7,5)
    quickSortMerge(arr,0,arr.length-1)
    println(arr.toList)
  }

  def quickSort(arr: Array[Int], start: Int, end: Int): Int = {
    val p = arr(start)
    var mid = start
    for (i <- start + 1 to  end) {
      if (arr(i) < p) {
        mid += 1
        swap(arr, i, mid)
      }
    }
    swap(arr, start, mid)
    mid
  }

  def quickSortMerge(a: Array[Int], start: Int, end: Int): Unit = {
    if(start < end){
      val mid =  quickSort(a,start,end)
      quickSortMerge(a,start,mid-1)
      quickSortMerge(a,mid+1,end)
    }
  }

  def swap(arr: Array[Int], a: Int, b: Int):Unit = {
    val mid = arr(a)
    arr(a) = arr(b)
    arr(b) = mid
  }

}
