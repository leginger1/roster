
-- Test Users
INSERT INTO user (id, firstName, lastName) VALUES (1, 'Seamus', 'Timmons');
INSERT INTO user (id, firstName, lastName) VALUES (2, 'Test', 'User');

-- Test Business
INSERT INTO business (id, name) VALUES (1, 'Test Business');
INSERT INTO business (id, name) VALUES (2, 'Super Cool Business');

-- Test Employees
INSERT INTO employee (id, user_id, business_id) VALUES (1, 1, 1);
INSERT INTO employee (id, user_id, business_id) VALUES (2, 1, 2);
INSERT INTO employee (id, user_id, business_id) VALUES (3, 2, 2);

-- Test Shifts
INSERT INTO shift (id, employee_id, startTime, endTime, note) VALUES (1, 1, '2022-02-01 12:00:00', '2022-02-01 16:00:00', 'Front Desk');
INSERT INTO shift (id, employee_id, startTime, endTime, note) VALUES (2, 2, '2022-02-01 13:00:00', '2022-02-01 15:00:00', 'Breaks');
INSERT INTO shift (id, employee_id, startTime, endTime, note) VALUES (3, 3, '2022-02-01 20:00:00', '2022-02-02 02:00:00', 'Night Shift');