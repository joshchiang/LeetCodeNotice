package main

import (
	"fmt"
	"strconv"
)

func main() {
	fmt.Println("Bubble Sort")
	data := []int{89, 34, 23, 78, 67, 100, 66, 29, 79, 55, 78, 88, 92, 96, 96, 23}
	dataLen := len(data)

	for i := 0; i < dataLen; i++ {
		for j := i + 1; j < dataLen; j++ {
			if data[i] > data[j] {
				tempI := data[i]
				tempJ := data[j]
				data[i] = tempJ
				data[j] = tempI
			}
		}
	}

	for i := 0; i < dataLen; i++ {
		fmt.Println("test data:" + strconv.Itoa(data[i]))
	}

}
