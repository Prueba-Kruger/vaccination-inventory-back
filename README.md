# vaccination-inventory-back

BBD 

crear una base de datos postgres llamada vaccination


ejecutar 


INSERT INTO public.users
(user_id, dni, full_name, "password", username, employee_id)
VALUES('a8c03e41-41d8-445d-ac66-bf793da063db', '1803921285', 'romario aponte', '123456', 'romario.aponte', '24a90ba6-116c-4d93-9a98-e0cbb806c7db');

INSERT INTO public.vaccines
(vaccine_id, "name", description)
VALUES('01e67784-f6ef-48ed-a9d2-8a66f812db86', 'Sputnik', 'Sputnik');
INSERT INTO public.vaccines
(vaccine_id, "name", description)
VALUES('e25d37d3-620c-4f05-ada1-62b3c8712268', 'AstraZeneca', 'AstraZeneca');
INSERT INTO public.vaccines
(vaccine_id, "name", description)
VALUES('271521d7-7c44-49a0-9dee-e319e7c28e0c', 'Pfizer', 'Pfizer');
INSERT INTO public.vaccines
(vaccine_id, "name", description)
INSERT INTO public.employees_vaccines
(employee_vaccine_id, employee_id, vaccine_id, "date", dose)
VALUES('482201b5-fa07-43ad-8322-c18f433d2095', '24a90ba6-116c-4d93-9a98-e0cbb806c7db', '01e67784-f6ef-48ed-a9d2-8a66f812db86', '2022-10-15 08:53:46.000', '1');
INSERT INTO public.employees_vaccines
(employee_vaccine_id, employee_id, vaccine_id, "date", dose)
VALUES('448cc08b-7770-4355-94d8-f86ee685f125', '24a90ba6-116c-4d93-9a98-e0cbb806c7db', 'e25d37d3-620c-4f05-ada1-62b3c8712268', '2022-10-15 08:53:46.000', '2');
INSERT INTO public.employees_vaccines
(employee_vaccine_id, employee_id, vaccine_id, "date", dose)
VALUES('a8776fb6-3f83-4291-9826-d0d000f543b4', '24a90ba6-116c-4d93-9a98-e0cbb806c7db', '271521d7-7c44-49a0-9dee-e319e7c28e0c', '2022-10-15 08:53:46.000', '3');
INSERT INTO public.employees_vaccines
(employee_vaccine_id, employee_id, vaccine_id, "date", dose)
VALUES('e2142d87-1848-49cc-b095-783b6d55650d', '24a90ba6-116c-4d93-9a98-e0cbb806c7db', 'a899fd0a-6a3c-4704-8158-a0c7fac018ed', '2022-10-15 08:53:46.000', '4');


INSERT INTO public.roles
(role_id, "name")
VALUES('1eda2720-4d17-4c75-9203-78661677811d', 'Administrador');
INSERT INTO public.roles
(role_id, "name")
VALUES('6daf4ad1-dfa8-4d2a-8c9a-cb85e0966f19', 'Empleado.');
INSERT INTO public.permissions
(permission_id, domain_action, "name")
VALUES('ff5aea02-ec54-4df7-a306-e84fc99c37c3', 'ALLOW_ACTION_REGISTER', 'registrar');
INSERT INTO public.permissions
(permission_id, domain_action, "name")
VALUES('dc9ae38d-cf44-485c-b967-f4e533eef344', 'ALLOW_ACTION_EDIT', 'editar');
INSERT INTO public.permissions
(permission_id, domain_action, "name")
VALUES('c00a9938-ff75-4d8c-85d3-e6f348bb3fce', 'ALLOW_ACTION_LIST', 'listar');
INSERT INTO public.permissions
(permission_id, domain_action, "name")
VALUES('a1494d08-0dba-4363-9a7a-83e0a1d4885b', 'ALLOW_ACTION_DELETE', 'eliminar');

INSERT INTO public.roles_permissions
(roles_role_id, permissions_permission_id)
VALUES('1eda2720-4d17-4c75-9203-78661677811d', 'ff5aea02-ec54-4df7-a306-e84fc99c37c3');
INSERT INTO public.roles_permissions
(roles_role_id, permissions_permission_id)
VALUES('1eda2720-4d17-4c75-9203-78661677811d', 'dc9ae38d-cf44-485c-b967-f4e533eef344');
INSERT INTO public.roles_permissions
(roles_role_id, permissions_permission_id)
VALUES('1eda2720-4d17-4c75-9203-78661677811d', 'c00a9938-ff75-4d8c-85d3-e6f348bb3fce');
INSERT INTO public.roles_permissions
(roles_role_id, permissions_permission_id)
VALUES('1eda2720-4d17-4c75-9203-78661677811d', 'a1494d08-0dba-4363-9a7a-83e0a1d4885b');