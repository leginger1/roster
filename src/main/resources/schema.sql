
-- User Table
CREATE TABLE user (
    id              INTEGER         NOT NULL AUTO_INCREMENT,
    firstName       VARCHAR(128)    NOT NULL,
    lastName        VARCHAR(128)    NOT NULL,

    PRIMARY KEY (id)
);

-- Business Table
CREATE TABLE business (
    id              INTEGER         NOT NULL AUTO_INCREMENT,
    name            VARCHAR(128)    NOT NULL,

    PRIMARY KEY (id)
);

-- Employee Table
CREATE TABLE employee (
    id              INTEGER         NOT NULL AUTO_INCREMENT,
    user_id         INTEGER         NOT NULL,
    business_id     INTEGER         NOT NULL,

    PRIMARY KEY (id),
    FOREIGN KEY (user_id)           REFERENCES user(id),
    FOREIGN KEY (business_id)       REFERENCES business(id)
);

-- Shift Table
CREATE TABLE shift (
    id              INTEGER         NOT NULL AUTO_INCREMENT,
    employee_id     INTEGER         NOT NULL,
    startTime       TIMESTAMP       NOT NULL,
    endTime         TIMESTAMP       NOT NULL,
    note            VARCHAR(128)    NOT NULL,

    PRIMARY KEY (id),
    FOREIGN KEY (employee_id)       REFERENCES employee(id)
);