--liquibase formatted sql
--changeset vpodgurskiy:1-1

create table if not exists public.messages
(
    id serial,
    sender varchar(100),
    message_text varchar(800),
    constraint messages_pkey primary key(id)
);

--rollback drop table if exists public.messages


