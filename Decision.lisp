;set x to 10, then since x<20 it will enter the if statement 

(setq x 10)
(if (> x 20)
	(format t "~% x is less than 20"))
(format t "~% value of x is ~d" x)