package hellojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class JpaMain {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("hello");

        EntityManager entityManager = entityManagerFactory.createEntityManager();
        //code
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        try {
            // TODO: create

           /* Member member = new Member();
            member.setId(1L);
            member.setName("HelloJPA");

            entityManager.persist(member);*/

            // TODO: read

            /*List<Member> resultList = entityManager.createQuery("select m from Member as m", Member.class)
                    .getResultList();

            for (Member member : resultList) {
                System.out.println("member.getName = " + member.getName());
            }*/
            // TODO: update

            /*Member findMember = entityManager.find(Member.class, 1L);
            findMember.setName("helloC");*/

            // TODO: remove

            /*Member findMember = entityManager.find(Member.class, 1L);
            entityManager.remove(findMember);*/

            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
        } finally {
            entityManager.close();
        }
        entityManagerFactory.close();
    }
}
