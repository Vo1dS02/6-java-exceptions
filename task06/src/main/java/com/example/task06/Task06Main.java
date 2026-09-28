package com.example.task06;

public class Task06Main {
    public static void main(String[] args) {
        new Task06Main().printMethodName();
    }

    void printMethodName() {
        try {
            // Намеренно выбрасываю исключение
            throw new Exception();
        } catch (Exception e) {
            // Получаю снимок стека вызовов из пойманного исключения
            StackTraceElement[] stackTrace = e.getStackTrace();

            // Индекс 0 — это сам метод printMethodName (где было выброшено исключение)
            // Индекс 1 — это метод, который вызвал метод printMethodName
            String callerMethodName = stackTrace[1].getMethodName();

            // Использую print, чтобы избежать добавления системных '\r' на Windows
            System.out.print(callerMethodName);
        }
    }
}
