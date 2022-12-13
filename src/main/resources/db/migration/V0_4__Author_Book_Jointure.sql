alter table book
    drop column author;
alter table book
    add column author_id integer;
alter table book
    add constraint id_book_author_fk
        foreign key (author_id) references author(id);
