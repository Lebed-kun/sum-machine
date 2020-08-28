//*1) Добавь фильтры LESQ, GRTQ, NDVB с функциями:
//
//LESQ < X > - число меньшее или равное X;
//GRTQ < X > - число большее или равное X;
//NDVB < X > - число не делящееся на X;
//
//2) Добавь обработку сценария, когда из потока ввода пришел несуществующий фильтр
// (обратить внимание также на сущности App и AppState).
// Если из потока пришел несуществующий фильтр,
// то должно в поток вывода прийти сообщение о том что данный фильтр не определен.
// И приложение после этого завершается
//
//
//_______________________________*******************_______________________________
//
//
//
//3) Добавить обработку нечислового инпута для аргументов фильтра и исходного набора чисел.
// Например, если пользователь ввел в первой строке:
//
//DIVB abcdef1124
//То программа должна вывести сообщение типа "Invalid filter arguments. They must be integer numbers" и завершится
//
//Или если ввел во второй строке:
//hdbuhsa
//То сценарий аналогичен предыдущему, но с немного другой ошибкой
//
//Или если в третьей что-то вроде:
//34 2 sd fd 12x dsasd 34
//
//То после этого прога тоже должна падать с ошибкой
//
//

//
//4) Добавить фильтры со следующими свойствами:
//IBND X Y - проверяет, находится ли число между X и Y;
//ISPRM - проверяет, является ли число простым (простое число - это целое положительное число которое делится нацело только на 1 и само себя);
//ISSUM X1 X2 ... XN - проверяет, является ли число суммой чисел X1, X2, ... XN (количество аргументов N может быть произвольным)
//
//Подсказка: метод nextLine у Scanner считывает всю строку от текущего символа на котором остановился сканнер,
// до символа переноса строки.
// И Scanner можно создать не только из консольного инпута, но и из строки и пр.
//
//
//System.in - такой же ресурс как и строка, только расположенный по другим адресам в памяти.
//
//Т.к. теперь фильтр не обязан получать строго 1 число для сравнения,
// придется переработать интерфейс фильтра, метод считывания строки с фильтром и пр. Из этого вытекает еще задача:
//
//3) Для существующих фильтров помимо проверки из п. 1, добавить еще проверку на верное количество аргументов для каждого из них
//
//
//System.in - такой же ресурс как и строка, только расположенный по другим адресам в памяти.
//
//Т.о. валидация аргументов фильтра должна быть в самом фильтре.
// А на вход фильтр будет получать тупо набор строк (далее, возможно,
// добавим фильтр который может принимать нечисловые аргументы и пр.)
//
//
//