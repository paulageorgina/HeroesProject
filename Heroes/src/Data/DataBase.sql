CREATE DATABASE Comics();

CREATE TABLE ADMIN_COMICS( 
    ID_ADMIN_COMICS SERIAL NOT NULL,
    ADMIN_USER_NAME CHARACTER VARYING NOT NULL,
    ADMIN_PASSWORD_USER CHARACTER VARYING NOT NULL,
    ID_IMAGES_USER INTEGER,
    constraint ID_ADMIN_COMICS_PK PRIMARY KEY (ID_ADMIN_COMICS),
    constraint ID_IMAGES_USER_PK FOREIGN KEY (ID_IMAGES_USER) REFERENCES IMAGES_USER (ID_IMAGES_USER)
    ) 
    
WITH( 
    OIDS = FALSE 
);

CREATE TABLE USER_COMICS( 
    ID_USER_COMICS SERIAL NOT NULL,
    COMICS_USER_NAME CHARACTER VARYING NOT NULL,
    COMICS_PASSWORD_USER CHARACTER VARYING NOT NULL,
    constraint ID_USER_COMICS_PK PRIMARY KEY (ID_USER_COMICS)
    )
	WITH( 
    OIDS = FALSE 
);


CREATE TABLE IMAGES_USER( 
	ID_IMAGES_USER SERIAL NOT NULL,
    DESCRIPTION_IMAGES CHARACTER VARYING NOT NULL,
    FOTO_USER BYTEA,                                           
    constraint ID_IMAGES_USER_PK PRIMARY KEY (ID_IMAGES_USER)
);

INSERT INTO ADMIN_COMICS(ADMIN_USER_NAME,
                         ADMIN_PASSWORD_USER, ID_IMAGES_USER)
VALUES ('ANTHONY',
       '18102001ANTHONY', 1);
	   
INSERT INTO IMAGES_USER(DESCRIPTION_IMAGES,
                         FOTO_USER)
VALUES ('Green Arrow es un superhéroe que aparece en los cómics publicados por DC Comics. 
		Creado por Mort Weisinger y diseñado por George Papp, apareció por primera vez en 
		More Fun Comics #73 en noviembre de 1941. Su nombre real es Oliver Jonas Queen, 
		un empresario adinerado y propietario de Industrias Queen que también es una celebridad 
		muy conocida en Star City. A veces se muestra vestido como el personaje de Robin Hood, 
		Green Arrow es un arquero que usa sus habilidades para combatir el crimen en sus ciudades 
		natales de Star City y Seattle, así como junto a sus compañeros superhéroes como miembro de 
		la Liga de la Justicia.',
       '18102001facasvasdvsd');
INSERT INTO IMAGES_USER(DESCRIPTION_IMAGES,
                         FOTO_USER)
VALUES ('Batman (conocido inicialmente como Bat-Man y en español como el Hombre Murciélago) es un personaje creado por los estadounidenses Bob Kane y Bill Finger, y propiedad de DC Comics. Apareció por primera vez en la historia titulada «El caso del sindicato químico» de la revista Detective Comics N.º 27, lanzada por la editorial National Publications el 30 de marzo de 1939. La identidad secreta de Batman es Bruce Wayne (Bruno Díaz en algunos países de habla hispana), un multimillonario magnate empresarial y filántropo dueño de Empresas Wayne en Gotham City. Después de presenciar el asesinato de sus padres, el Dr.',
       '18102001facasvasdvsd');
INSERT INTO IMAGES_USER(DESCRIPTION_IMAGES,
                         FOTO_USER)
VALUES ('Canario Negro (en inglés, Black Canary) es una superheroína ficticia que aparece en los cómics estadounidenses publicados por DC Comics. Creado por el equipo de escritores y artistas de Robert Kanigher y Carmine Infantino, el personaje debutó en Flash Comics # 86 (agosto de 1947). Una de los primeros super-heroínas de DC, Canario Negro ha aparecido en muchas de insignia de la compañía Team-Up títulos como Sociedad de la Justicia de América y la Liga de la Justicia de América. Desde finales de la década de 1960, el personaje ha sido emparejado con el superhéroe arquero Flecha Verde, profesional y románticamente.',
       '18102001facasvasdvsd');
INSERT INTO IMAGES_USER(DESCRIPTION_IMAGES,
                         FOTO_USER)
VALUES ('Escarabajo Azul (Jaime Reyes) es un personaje ficticio que aparece en varios cómics publicados por DC Comics. El personaje aparece por primera vez en Infinite Crisis #3 (Feb. 2006). Fue creado por los escritores Keith Giffen y John Rogers, junto con el artista Cully Hamner.1Jaime Reyes es el tercer personaje en asumir el manto de Escarabajo Azul, pero es sustancialmente diferente de sus predecesores. Introducido en 1939, el Escarabajo Azul original, Dan Garrett, era un agente de policía de Fox Comics que combatió el crimen con superpoderes adquiridos al ingerir Vitamina 2X.',
       '18102001facasvasdvsd');

INSERT INTO IMAGES_USER(DESCRIPTION_IMAGES,
                         FOTO_USER)
VALUES ('Green Arrow es un superhéroe que aparece en los cómics publicados por DC Comics. 
		Creado por Mort Weisinger y diseñado por George Papp, apareció por primera vez en 
		More Fun Comics #73 en noviembre de 1941. Su nombre real es Oliver Jonas Queen, 
		un empresario adinerado y propietario de Industrias Queen que también es una celebridad 
		muy conocida en Star City. A veces se muestra vestido como el personaje de Robin Hood, 
		Green Arrow es un arquero que usa sus habilidades para combatir el crimen en sus ciudades 
		natales de Star City y Seattle, así como junto a sus compañeros superhéroes como miembro de 
		la Liga de la Justicia.',
       '18102001facasvasdvsd');

SELECT *
FROM USER_COMICS;

SELECT *
FROM ADMIN_COMICS;

SELECT *
FROM IMAGES_USER;