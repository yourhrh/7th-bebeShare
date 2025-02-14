package bebeShare.domain.user;

import bebeShare.domain.posts.Posts;
import bebeShare.domain.posts.PostsRepository;
import bebeShare.domain.product.Product;
import bebeShare.domain.product.ProductRepository;
import bebeShare.web.userDto.GiveInfoResponseDto;
import bebeShare.web.userDto.LikeInfoResponseDto;
import bebeShare.web.userDto.MemberCommentResponseDto;
import bebeShare.web.userDto.ShareInfoResponseDto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;



@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTest {


    @Autowired
    UserRepository userRepository;

    @Autowired
    ProductRepository productRepository;


    @Test
    public void id조회() {
        Optional<User> byId = userRepository.findById(1L);
        System.out.println("user:" + byId);
        assertThat(byId.get().getName()).isEqualTo("test");

    }

//    @Test
//    public void 나눔한내역조회() {
//        List<ShareInfoResponseDto> products = userRepository.shareInfo(1L,"C");
//        for (ShareInfoResponseDto shareInfo : products) {
//            System.out.println("shareInfo:" +shareInfo.toString());
//        }
//    }
//
//    @Test
//    public void 나눔받은내역조회() {
//        List<GiveInfoResponseDto> products = userRepository.giveInfo(3L,"C");
//        for (GiveInfoResponseDto giveInfo : products) {
//            System.out.println("giveInfo:" +giveInfo.toString());
//        }
//    }
//
//    @Test
//    public void 찜목록조회() {
//        List<LikeInfoResponseDto> products = userRepository.likeInfo(2L);
//        for (LikeInfoResponseDto likeInfo : products) {
//            System.out.println("likeInfo:" +likeInfo.toString());
//        }
//    }
//
//    @Test
//    public void 댓글목록조회() {
//        List<MemberCommentResponseDto> products = userRepository.comments(3L);
//        for (MemberCommentResponseDto comment : products) {
//            System.out.println("comment:" +comment.toString());
//        }
//    }
}