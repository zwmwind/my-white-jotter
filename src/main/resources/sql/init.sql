DROP TABLE
    IF
    EXISTS t_user;
CREATE TABLE t_user (
                        id INT ( 11 ) UNSIGNED NOT NULL AUTO_INCREMENT,
                        username VARCHAR ( 255 ) DEFAULT NULL,
                        password VARCHAR ( 255 ) DEFAULT NULL,
                        PRIMARY KEY ( id )
);
