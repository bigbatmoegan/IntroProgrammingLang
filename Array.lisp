;Demonstrate creating an array and filling itoa

(setf my-array (make-array '(10)))
(setf (aref my-array 0) 1)
(setf (aref my-array 1) 2)
(setf (aref my-array 2) 3)
(setf (aref my-array 3) 4)
(setf (aref my-array 4) 5)
(setf (aref my-array 5) 6)
(setf (aref my-array 6) 7)
(setf (aref my-array 7) 8)
(setf (aref my-array 8) 9)
(setf (aref my-array 9) 10)

(write my-array)