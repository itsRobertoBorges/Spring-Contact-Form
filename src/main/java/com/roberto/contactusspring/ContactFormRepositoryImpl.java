package com.roberto.contactusspring;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class ContactFormRepositoryImpl implements ContactFormRepository{

    @Override
    public void flush() {

    }

    @Override
    public <S extends ContactForm> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends ContactForm> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<ContactForm> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public ContactForm getOne(Long aLong) {
        return null;
    }

    @Override
    public ContactForm getById(Long aLong) {
        return null;
    }

    @Override
    public ContactForm getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends ContactForm> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends ContactForm> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends ContactForm> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends ContactForm> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends ContactForm> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends ContactForm> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends ContactForm, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends ContactForm> S save(S entity) {
        return null;
    }

    @Override
    public <S extends ContactForm> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<ContactForm> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List<ContactForm> findAll() {
        return null;
    }

    @Override
    public List<ContactForm> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(ContactForm entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends ContactForm> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<ContactForm> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<ContactForm> findAll(Pageable pageable) {
        return null;
    }
}
