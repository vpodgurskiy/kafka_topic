--liquibase formatted sql
--changeset vpodgurskiy:1-1

create table if not exists public.orders
(
    id serial,
    description  varchar(255),
    order_number varchar(50),
    status       varchar(50),
    constraint order_pkey primary key(id)
);

--rollback drop table if exists public.orders


