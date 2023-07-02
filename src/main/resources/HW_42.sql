CREATE DATABASE "OnlineSchool"
    WITH
    OWNER = postgres
    ENCODING = 'UTF8'
    CONNECTION LIMIT = -1
    IS_TEMPLATE = False;

----------------------------------------


CREATE TABLE public."Students"
(
    id serial NOT NULL,
    name text,
    second_name text,
    PRIMARY KEY (id)
);

ALTER TABLE IF EXISTS public."Students"
    OWNER to postgres;

----------------------------------------


INSERT INTO public.students(
	id, name, second_name)
	VALUES (1, 'Eduard','Fedorovich');


-------------------------------------------

INSERT INTO public.students(
	id, name, second_name)
	VALUES (1, 'Orest','Ivanovich');

INSERT INTO public.students(
	id, name, second_name)
	VALUES (1, 'Arkady','Vadimovich');

INSERT INTO public.students(
	id, name, second_name)
	VALUES (1, 'Makar','Eduardovich');

INSERT INTO public.students(
	id, name, second_name)
	VALUES (1, 'Gerard','Platonovich');


SELECT * FROM Students





