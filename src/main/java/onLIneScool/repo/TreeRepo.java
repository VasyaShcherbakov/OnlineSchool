package onLIneScool.repo;

import onLIneScool.entity.Tree;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Repository
public class TreeRepo extends JpaRepository<Tree, Long> {

    @Override
    public List<Tree> findAll() {
        return null;
    }

    @Override
    public List<Tree> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Tree> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Tree> findAllById(Iterable<Long> longs) {
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
    public void delete(Tree entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Tree> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Tree> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Tree> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Tree> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Tree> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Tree> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Tree> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Tree getOne(Long aLong) {
        return null;
    }

    @Override
    public Tree getById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Tree> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Tree> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Tree> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Tree> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Tree> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Tree> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Tree, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
