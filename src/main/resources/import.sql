
----------------------------------INSERTS USUARIO----------------------------------
INSERT INTO public.usuario(apellidos, nombre, password, username, administrador)VALUES ('Sánchez Andrade','Daniel Santiago','123456','daniel',false);
INSERT INTO public.usuario(apellidos, nombre, password, username, administrador)VALUES ('Guerrero Danderino','Brayan','123456','brayan',false);

----------------------------------INSERTS LIBROS----------------------------------
INSERT INTO public.libro(id, autor, cantidad, editorial, nombre, precio, escogido, nombre_archivo) VALUES (1, 'Gabriel Garcia Marquez', 3, 'Panamericana', '100 años de soledad', 50000, false, 'CienAnios.jpg');
INSERT INTO public.libro(id, autor, cantidad, editorial, nombre, precio, escogido, nombre_archivo) VALUES (2, 'Gabriel Garcia Marquez', 2, 'Grupo planeta', 'Crónica de una muerte anunciada', 40000, false, 'CronicaMuerte.jpg');
INSERT INTO public.libro(id, autor, cantidad, editorial, nombre, precio, escogido, nombre_archivo) VALUES (3, 'Gabriel Garcia Marquez', 5, 'Alfaomega colombiana', 'Del amor y otros demonios', 60000, false, 'AmorDemonios.jpg');
INSERT INTO public.libro(id, autor, cantidad, editorial, nombre, precio, escogido, nombre_archivo) VALUES (4, 'Julio Cortazar', 1, 'Panamericana', 'Rayuela', 80000, false, 'Rayuela.jpg');
INSERT INTO public.libro(id, autor, cantidad, editorial, nombre, precio, escogido, nombre_archivo) VALUES (5, 'Julio Cortazar', 2, 'Panamericana', 'Casa tomada', 50000, false, 'CasaTomada.jpg');
INSERT INTO public.libro(id, autor, cantidad, editorial, nombre, precio, escogido, nombre_archivo) VALUES (6, 'Dante Alighieri', 10, 'Grupo planeta', 'Divina comedia', 100000, false, 'DivinaComedia.jpg');
INSERT INTO public.libro(id, autor, cantidad, editorial, nombre, precio, escogido, nombre_archivo) VALUES (7, 'Dante Alighieri', 6, 'Grupo planeta', 'Purgatorio', 30000, false, 'Purgatorio.jpg');
INSERT INTO public.libro(id, autor, cantidad, editorial, nombre, precio, escogido, nombre_archivo) VALUES (8, 'Dante Alighieri', 3, 'Grupo planeta', 'Vida nueva', 50000, false, 'VidaNueva.jpg');
INSERT INTO public.libro(id, autor, cantidad, editorial, nombre, precio, escogido, nombre_archivo) VALUES (9, 'Gabriel Garcia Marquez', 11, 'Grupo planeta', 'El amor en los tiempos del cólera', 20000, false, 'AmorColera.jpg');
INSERT INTO public.libro(id, autor, cantidad, editorial, nombre, precio, escogido, nombre_archivo) VALUES (10, 'Julio Verne', 6, 'El grillo', 'La vuelta al mundo en 80 dias', 40000, false, 'VueltaAlMundo.jpg');
INSERT INTO public.libro(id, autor, cantidad, editorial, nombre, precio, escogido, nombre_archivo) VALUES (11, 'Julio Verne', 3, 'El grillo', 'Viaje al centro de la tierra', 90000, false, 'ViajeCentro.jpg');
INSERT INTO public.libro(id, autor, cantidad, editorial, nombre, precio, escogido, nombre_archivo) VALUES (12, 'Julio Verne', 2, 'Alfaomega colombiana', 'La isla misteriosa', 80000, false, 'IslaMisteriosa.jpg');
INSERT INTO public.libro(id, autor, cantidad, editorial, nombre, precio, escogido, nombre_archivo) VALUES (13, 'Gabriel Garcia Marquez', 1, 'Alfaomega colombiana', 'El coronel no tiene quién le escriba', 50000, false, 'Coronel.jpg');
