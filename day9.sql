CREATE TABLE Pets(
    id INTEGER PRIMARY KEY,
    name TEXT(30) NOT NULL,
    type TEXT(20)
);

INSERT INTO Pets(id, name, type)
VALUES(1,'Muris', 'Kaķis'),
      (2,'Duksis', 'Suns'),
      (3,'Mice', 'Kaķis');
      
SELECT * FROM Pets;

DROP TABLE Pets;

CREATE TABLE Authors(
    id INTEGER PRIMARY KEY,
    authorName TEXT(30) NOT NULL,
    authorSurname TEXT(30) NOT NULL,
    birthYear INTEGER

);

INSERT INTO Authors(id, authorName, authorSurname,birthYear)
VALUES (1, 'Jānis', 'Jaunsudrabiņš', 1877),
       (2, 'Nora', 'Ikstena', 1961),
       (3, 'Jū', 'Nesbē', 1960);
        
SELECT * FROM Authors; 

CREATE TABLE Books(
    id INTEGER PRIMARY KEY,
    bookName TEXT(30) NOT NULL,
    releaseYear INTEGER,
    AuthorsId INTEGER,
    FOREIGN KEY(AuthorsId) REFERENCES Authors(Id)
);
INSERT INTO Books(id, bookName, releaseYear, AuthorsId )
VALUES (1, 'Baltā grāmata', 1942, 1 ),
        (2, 'Zaļā grāmata', 1950, 1 ),
        (3, 'Sikspārnis', 1997, 3),
        (4, 'Sniegavīrs', 2007, 3),
        (5, 'Mātes piens',2015, 2);

SELECT * FROM Books;

SELECT Books.bookName, Books.releaseYear, Authors.authorName, Authors.authorSurname, Authors.birthYear
FROM Books,Authors
WHERE Books.AuthorsId = Authors.id
        
