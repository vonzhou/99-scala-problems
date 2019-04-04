# Ninety-Nine Scala Problems

Do the [S-99: Ninety-Nine Scala Problems](http://aperiodic.net/phil/scala/s-99/)

## 1. Working with lists

### P01 (*) Find the last element of a list

[P01.scala](src/main/scala/P01.scala)

### P02 (*) Find the last but one element of a list

[P02.scala](src/main/scala/P02.scala)

### P03 (*) Find the Kth element of a list

By convention, the first element in the list is element 0.

[P03.scala](src/main/scala/P03.scala)

The `List(n)`  implementation:

```scala
def apply(n: Int): A = {
    val rest = drop(n)
    if (n < 0 || rest.isEmpty) throw new IndexOutOfBoundsException("" + n)
    rest.head
  }
```

### P04 (*) Find the number of elements of a list

[P04.scala](src/main/scala/P04.scala)

The `List.length()` implementation:

```scala
def length: Int = {
    var these = self
    var len = 0
    while (!these.isEmpty) {
      len += 1
      these = these.tail
    }
    len
  }
```

### P05 (*) Reverse a list

[P05.scala](src/main/scala/P05.scala)

The `List.reverse()` implementation, O(N)?:

```scala
override def reverse: List[A] = {
    var result: List[A] = Nil
    var these = this
    while (!these.isEmpty) {
      result = these.head :: result
      these = these.tail
    }
    result
  }
```

### P06 (*) Find out whether a list is a palindrome

[P06.scala](src/main/scala/P06.scala)

### P07 (**) Flatten a nested list structure

[P07.scala](src/main/scala/P07.scala)

**Think** how flatMap implemented, map then flatten ?


### P08 (**) Eliminate consecutive duplicates of list elements

[P08.scala](src/main/scala/P08.scala)


use `dropWhile`.

### P09 (**) Pack consecutive duplicates of list elements into sublists

[P09.scala](src/main/scala/P09.scala)

**Notice the differences of List's `partition` and `span`**.

`partition` will put all "true" elements in one list, and the others in the second list.

`span` will put all elements in one list until an element is "false" (in terms of the predicate). For example:

```scala
scala> val list = List(1,1,2,1,3)
list: List[Int] = List(1, 1, 2, 1, 3)

scala> list.partition{_ == 1}
res0: (List[Int], List[Int]) = (List(1, 1, 1),List(2, 3))

scala> list.span{_ == 1}
res1: (List[Int], List[Int]) = (List(1, 1),List(2, 1, 3))
```



### P10 (*) Run-length encoding of a list

Use the result of problem P09 to implement the so-called run-length encoding(游程编码) data compression method.
Consecutive duplicates of elements are encoded as tuples (N, E) where N is the number of duplicates of the element E.

[P10.scala](src/main/scala/P10.scala)


### P11 (*) Modified run-length encoding

Modify the result of problem P10 in such a way that if an element has no duplicates it is simply copied into the result list.
Only elements with duplicates are transferred as (N, E) terms.

### P12 RLE解码

flatMap, List.fill

### P13 直接实现RLE

有区别吗？

### P14 复制元素

### P15 复制元素，指定次数

### P16 每N个元素删除一个

zipWithIndex -> filter -> map

### P17 拆分为两部分

splitAt

### P18 子列表[a,b)

slice

### P19 旋转

### P20 移除第K个元素

### P21 指定位置插入元素

`::`, `:::` 是prepend


### P22 生成区间整数

range

### P23 随机选元素

利用java.util.Random和removeAt

### P24 Lotto

### P25 随机排列

使用P23的随机选择，复杂度 O(N^2)

Fisher–Yates shuffle算法，复杂度 O(N)

没有ClassTag，会报错  No ClassTag available for A。 

### P26(**) K个子元素的排列组合


### P28 根据子列表长度排序

sortWith


## 数学














