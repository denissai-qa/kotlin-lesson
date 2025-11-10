package org.example.org.example.kotlinin.lessons.lesson07.homeworks

////Задания для цикла for
////Прямой диапазон
//// Напишите цикл for, который выводит числа от 1 до 5.
fun main (){
//    for (i: Int in 1..5){
//        println("i = " + i )
//    }
//
////
//////Напишите цикл for, который выводит четные числа от 1 до 10.
//for (chet in 1..<10){
//    println( chet )
//}
//
//
//

////Обратный диапазон
//Создайте цикл for, который выводит числа от 5 до 1.
//for (obraatno in 5 downTo 1 ){
//println("1 =" + " " +  obraatno)}
//}
////Создайте цикл for, который выводит числа от 10 до 1, уменьшая их на 2.
//for ( poniz in 10 downTo  2 step 2) {
//    println( "p =" + " " + poniz )
//}}
//С шагом (step)
//Используйте цикл for с шагом 2 для вывода чисел от 1 до 9.
//for ( vverx in 1..9 step 2){
//    println(vverx )
//}}
//Напишите цикл for, который выводит каждое третье число в диапазоне от 1 до 20.
//for (tret in 1..20 step 3){
//    println(tret)
//}}
//Использование до (until)
// //Создайте числовую переменную 'size'. Используйте цикл for с шагом 2 для вывода чисел от 3 до size не включая size
//var size  = 51
//    for (two in 3 ..<size  step 2) {
//        println(two)
//    }}
//Задания для цикла while
//Цикл while
//Создайте цикл while, который выводит квадраты чисел от 1 до 5.




//var primer = 1
//    while (primer++ <5) {
//println(primer)
//    }}
//Напишите цикл while, который уменьшает число от 10 до 5. После этого вывести результат в консоль
//    var primer2 = 10
//    while (primer2-- >5){
//        println(primer2)
//    }}
//

//Цикл do while
//Используйте цикл do while, чтобы вывести числа от 5 до 1.
//var primer4 = 5
//do{
//    println(primer4)
//} while (primer4-- >1)}


//Создайте цикл do while, который повторяется, пока счетчик меньше 10, начиная с 5.
//Задания для прерывания и пропуска итерации
//Использование break
//var primer5 = 5
//    do {
//        if (primer5 == 10) {
//            break
//        }
//        println(primer5)
//        primer5++
//    } while (primer5<=10)
//}



//Напишите цикл for от 1 до 10 и используйте break, чтобы выйти из цикла при достижении 6.
//var primer6 = 1
//    for( primer6 in 1..10){
//        if (primer6 ==6) break
//        println(primer6)
//            }
//        }
//Создайте цикл while, который бесконечно выводит числа, начиная с 1, но прерывается при достижении 10.
//    var primer7 = 1
//    while (true){
//        primer7++
//        if (primer7>=10)break
//        println(primer7)
//    }
//}


//Использование continue
//В цикле for от 1 до 10 используйте continue, чтобы пропустить четные числа.
//for (primer9 in 1..10) {
//    if(primer9 %2 == 0) continue
//    println(primer9)
//}}
//Напишите цикл while, который выводит числа от 1 до 10, но пропускает числа, кратные 3.
for (primer10 in 1..10){
    if(primer10 %3 == 0) continue
    println(primer10)
}}