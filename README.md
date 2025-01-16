# Задание - API Тесты с использованием Rest Assured

## Описание задания

Данный проект включает реализацию API тестов для тестирования сервиса [Reqres.in](https://reqres.in/).


### Кейсы:


#### Кейс 1: Регистрация пользователя

1. **Успешная регистрация с валидными данными**:
   
   - Проверяется успешная регистрация.
     
   - Ожидается статус-код 200 и получение данных пользователя.


2. **Регистрация с ошибкой (отсутствие пароля)**:
   
   - Проверяется, что при отсутствии пароля возвращается статус-код 400.
     
   - Ожидается сообщение об ошибке `Missing password`.


#### Кейс 2: Получение списка пользователей

1. Получить список пользователей на определённой странице.
   
2. Проверить, что все email пользователей заканчиваются на `@reqres.in`.
   

#### Кейс 3: Удаление пользователя

1. Удалить второго пользователя в списке.
   
2. Проверить, что возвращается статус-код 204.
   

#### Кейс 4: Обновление информации о пользователе

1. Обновить информацию о пользователе с помощью метода `PATCH`.
   
2. Проверить, что дата обновления в ответе совпадает с текущей датой на стороне теста.


---


## Установка и настройка проекта

### Требования:

- Java 17+
  
- Maven 3.8+
  
- Интернет-соединение для загрузки зависимостей


### Установка:

1. Склонировать репозиторий:

   git clone [<ссылка-на-репозиторий>](https://github.com/Alexiisssss/REQRES_IN.git)
