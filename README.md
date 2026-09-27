# java-week2-mini3 
迷你 compiler：三個整數的加法敘述轉成 Mini-3 assembly

## OnlineGDB 執行與輸入方式
在 OnlineGDB 選擇 Java，執行 TinyCompiler.java。
按下 Run 後，在輸入區輸入固定格式的加法敘述。

輸入格式：
int result = A + B + C ;

A、B、C 為 0 至 99 的整數，且相鄰 token 之間需要留空白。
(老師給的教材第一頁的二、輸入格式與限制)

## 自己選的一組三個數字
輸入：
int result = 65 + 66 + 67 ;

實際輸出：
MOVI R1, 65
MOVI R2, 66
ADD R0, R1, R2
MOVI R2, 67
ADD R0, R0, R2
STORE [0], R0

最後運算結果為 198，並存入 M[0]。

## README回答
第一次 ADD 之後，為什麼能用第三個整數覆蓋 R2？

第一次執行 ADD R0, R1, R2 後，R1 和 R2 的數值已經完成相加，
相加後的結果會儲存在 R0，因此原本存放在 R2 的第二個整數已經不需要再使用。
所以可以把第三個整數放入 R2，再使用 ADD R0, R0, R2，
將前兩個整數的結果與第三個整數相加。

## README回答
若輸入改成 int result=7+3+1;，目前程式為什麼無法按預期讀取？

目前程式使用 Scanner 的 next() 和 nextInt() 依序讀取 token，
Scanner 預設會利用空白來區分不同的 token。

程式預期讀取的格式為：
int result = 7 + 3 + 1 ;

如果改成：
int result=7+3+1;

因為 result、=、數字、+ 和分號之間沒有空白，
它們會黏在一起成為同一個 token，因此程式無法按照原本設定的順序讀取資料。