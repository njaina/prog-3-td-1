create table book_category
(
    id serial,
    book_id int,
    category_id int,
    constraint book_id_fk
    foreign key (book_id) references book(id),
    constraint category_id_fk
    foreign key (category_id) references category(id),
    primary key (id)
)
