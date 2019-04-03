# Ninety-Nine Scala Problems

Do the [S-99: Ninety-Nine Scala Problems](http://aperiodic.net/phil/scala/s-99/)

## 1. Working with lists

### P01 (*) Find the last element of a list

### P02 找倒数第二个元素

### P03 找第K个元素

### P04 元素个数

### P05 逆转

### P06 是否是回文

### P07 扁平化嵌套列表

注意理解 flatMap, 相当于先map，然后flatten

### P08 消除连续重复元素

dropWhile

### P09 聚集连续重复元素到子列表

span

### P10 基于P09实现RLE（Run-length encoding ， 游程编码）

map


### P11 修改P10，仅重复元素编码成(N,E)格式

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














