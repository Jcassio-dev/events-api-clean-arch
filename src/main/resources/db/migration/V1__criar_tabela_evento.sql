-- V1__criar_tabela-evento.sql

CREATE TABLE events (
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    description TEXT,
    identifier VARCHAR(255) NOT NULL UNIQUE,
    start_date TIMESTAMP NOT NULL,
    end_date TIMESTAMP NOT NULL,
    location VARCHAR(255) NOT NULL,
    organizer VARCHAR(255) NOT NULL,
    capacity INTEGER DEFAULT 0,
    type VARCHAR(50) NOT NULL
);