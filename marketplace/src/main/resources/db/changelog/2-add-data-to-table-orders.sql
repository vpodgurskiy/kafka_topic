--liquibase formatted sql
--changeset vpodgurskiy:1-2

insert into public.orders("order_number", "description", "status")
VALUES
       ('325/43-3', 'Боксерские перчатки М, бел', 'RESERVED'),
       ('277/12-0', 'Чайник BODOOM 650', 'DELIVERED'),
       ('111/04-1', 'Велосипед дет, муж 6 лет', 'DELETED'),
       ('204/55-8', 'Краски РЫСЬ 7 цв', 'COURIER');



