;;Write a function which reverses a sequence.
(= (#(reduce (fn [l x]
  (conj l x)) '() %1) [1 2 3 4 5]) [5 4 3 2 1])


;Write a function which returns the sum of a sequence of numbers.
(= (#(reduce + %) [1 2 3]) 6)



;;Write a function which returns only the odd numbers from a sequence.
(= (#(filter odd? %) #{1 2 3 4 5}) '(1 3 5))



;;Write a function which returns the first X fibonacci numbers.
#(take % ((fn fib
            [a b]
            (lazy-seq
             (cons a (fib b (+ b a)))))
          1 1))

;;Write a function which returns true if the given sequence is a palindrome.
(true? ((fn [x] (= (reverse x) (seq x))) "racecar"))

