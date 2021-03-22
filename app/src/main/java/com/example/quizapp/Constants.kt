package com.example.quizapp

// Question repository
const val Question1 = "1. A and B are two events such that P(A) = 0.4 and P(A ∩ B) = 0.2 Then P(A ∩ B) is equal to ___________\n" +
        "a) 0.4\n" +
        "b) 0.2\n" +
        "c) 0.6\n" +
        "d) 0.8"
const val Question2 = "2. A problem in mathematics is given to three students A, B and C. If the probability of A solving the problem is 1⁄2 and B not solving it is 1⁄4. The whole probability of the problem being solved is 63⁄64 then what is the probability of solving it?\n" +
        "a) 1⁄8\n" +
        "b) 1⁄64\n" +
        "c) 7⁄8\n" +
        "d) 1⁄2"
const val Question3 = "3. Let A and B be two events such that P(A) = 1⁄5 While P(A or B) = 1⁄2. Let P(B) = P. For what values of P are A and B independent?\n" +
        "a) 1⁄10 and 3⁄10\n" +
        "b) 3⁄10 and 4⁄5\n" +
        "c) 3⁄8 only\n" +
        "d) 3⁄10"
const val Question4 = "\n" +
        "4. If A and B are two mutually exclusive events with P(~A) = 5⁄6 and P(b) = 1⁄3 then P(A /~B) is equal to ___________\n" +
        "a) 1⁄4\n" +
        "b) 1⁄2\n" +
        "c) 0, since mutually exclusive\n" +
        "d) 5⁄18"
const val Question5 = "5. If A and B are two events such that P(a) = 0.2, P(b) = 0.6 and P(A /B) = 0.2 then the value of P(A /~B) is ___________\n" +
        "a) 0.2\n" +
        "b) 0.5\n" +
        "c) 0.8\n" +
        "d) 1⁄3"
const val Question6 = "6. If A and B are two mutually exclusive events with P(a) > 0 and P(b) > 0 then it implies they are also independent.\n" +
        "a) True\n" +
        "b) False"
const val Question7 = "7. Let A and B be two events such that the occurrence of A implies occurrence of B, But not vice-versa, then the correct relation between P(a) and P(b) is?\n" +
        "a) P(A) < P(B)\n" +
        "b) P(B) ≥ P(A)\n" +
        "c) P(A) = P(B)\n" +
        "d) P(A) ≥ P(B)"
const val Question8 = "8. In a sample space S, if P(a) = 0, then A is independent of any other event.\n" +
        "a) True\n" +
        "b) False"
const val Question9 = "9. If A ⊂ B and B ⊂ A then,\n" +
        "a) P(A) > P(B)\n" +
        "b) P(A) < P(B)\n" +
        "c) P(A) = P(B)\n" +
        "d) P(A) < P(B)"
const val Question10 = "10. If A ⊂ B then?\n" +
        "a) P(a) > P(b)\n" +
        "b) P(A) ≥ P(B)\n" +
        "c) P(B) = P(A)\n" +
        "d) P(B) = P(B)"
// answer table
const val ans1="a"
const val ans2="c"
const val ans3="c"
const val ans4="a"
const val ans5="a"
const val ans6="b"
const val ans7="b"
const val ans8="a"
const val ans9="c"
const val ans10="b"

// Solution repository
const val Solution1 = " P(A ∩ B) = P(A – (A ∩ B))\n" +
        "= P(A) – P(A ∩ B)\n" +
        "= 0.6 – 0.2 Using P(A) = 1 – P(A)\n" +
        "= 0.4."
const val Solution2 = "Let A be the event of A solving the problem\n" +
        "Let B be the event of B solving the problem\n" +
        "Let C be the event of C solving the problem\n" +
        "Given P(a) = 1⁄2, P(~B) = 1⁄4 and P(A ∪ B ∪ C) = 63/64\n" +
        "We know P(A ∪ B ∪ C) = 1 – P(A ∪ B ∪ C)\n" +
        "\n" +
        "= 1 – P(A ∩ B ∩ C)\n" +
        "\n" +
        "= 1 – P(A) P(B) P(C)\n"+
        "Let P(C) = p\n" +
        "ie 63⁄64 = 1 – (1⁄2)(1⁄4)(p)\n" +
        "\n" +
        "= 1 – p⁄8\n" +
        "⇒ P =1/8 = P(C)\n" +
        "⇒P(C) = 1 – P = 1 – 1⁄8 = 7⁄8."
const val Solution3 = "For independent events,\n" +
        "P(A ∩ B) = P(A) P(B)\n" +
        "P(A ∪ B) = P(A) + P(B) – P(A ∩ B)\n" +
        "= P(A) + P(B) – P(A) P(B)\n" +
        "= 1⁄5 + P (1⁄5)P\n" +
        "⇒ 1⁄2 = 1⁄5 + 4⁄5P\n" +
        "⇒ P= 3⁄8."
const val Solution4 = "As A and B are mutually exclusive we have\n" +
        "A∩B¯\n" +
        "And Hence\n" +
        "P(A/B¯)=P(A∩B¯)P(B¯)\n" +
        "1−P(A¯)1−P(B¯)=1−561−13\n" +
        "P(A/B¯)=14"
const val Solution5 = "For independent events,\n" +
        "P(A /~B) = P(a) = 0.2."
const val Solution6 = "P(A ∩ B) = 0 as (A ∩ B) = ∅\n" +
        "But P(A ∩ B) ≠ 0 , as P(a) > 0 and P(b) > 0\n" +
        "P(A ∩ B) = P(A) P(B), for independent events."
const val Solution7 = "Here, according to the given statement A ⊆ B\n" +
        "P(B) = P(A ∪ (A ∩ B)) (∵ A ∩ B = A)\n" +
        "= P(A) + P(A ∩ B)\n" +
        "Therefore, P(B) ≥ P(A)"
const val Solution8 = " P(a) = 0 (impossible event)\n" +
        "Hence, A is not dependent on any other event."
const val Solution9 = "A ⊂ B and B ⊂ A => A = B\n" +
        "Hence P(a) = P(b)."
const val Solution10 = "A ⊂ B => B ⊂ A\n" +
        "Therefore, P(A) ≥ P(B)"






