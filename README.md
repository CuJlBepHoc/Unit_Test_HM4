# Урок 4. Зависимости в тестах

## Задание 1. Ответьте письменно на вопросы:

1. Почему использование тестовых заглушек может быть полезным при написании модульных тестов?
    - **Ответ**: Они позволяют изолировать тестируемый код от его зависимостей. Это делает модульные тесты более предсказуемыми и стабильными, так как они не зависят от внешних факторов. Кроме того, тесты с заглушками обычно выполняются быстрее, так как не требуется реального взаимодействия с внешними ресурсами.

2. Какой тип тестовой заглушки следует использовать, если вам нужно проверить, что метод был вызван с определенными аргументами?
    - **Ответ**: Mock. Эти объекты имитируют поведение реальных объектов без реальной реализации и позволяют настроить ожидаемые аргументы для вызова метода.

3. Какой тип тестовой заглушки следует использовать, если вам просто нужно вернуть определенное значение или исключение в ответ на вызов метода?
    - **Ответ**: Stub. Эта заглушка предоставляет простую реализацию, которая возвращает предопределенное значение или вызывает исключение при вызове метода. Они подходят для ситуаций, когда вам нужно просто вернуть определенное значение или сгенерировать исключение без сложной логики или проверок.

4. Какой тип тестовой заглушки вы бы использовали для имитации взаимодействия с внешним API или базой данных?
    - **Ответ**: Fake. Этот тип заглушки позволяет эмулировать ответы и поведение внешних систем, без доступа к реальным внешним ресурсам или для создания контролируемого окружения тестирования.

## Задание 2.

У вас есть класс BookService, который использует интерфейс BookRepository для получения информации о книгах из базы данных. Ваша задача написать unit-тесты для BookService, используя Mockito для создания мок-объекта BookRepository.
