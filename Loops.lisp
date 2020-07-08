(setq x 10)
(loop
	(setq x (+ x 1))
	(write x)
	(terpri)
	(when (> x 20) (return x))
)