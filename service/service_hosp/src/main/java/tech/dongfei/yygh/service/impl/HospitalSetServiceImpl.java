package tech.dongfei.yygh.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.dongfei.yygh.mapper.HospitalSetMapper;
import tech.dongfei.yygh.model.hosp.HospitalSet;
import tech.dongfei.yygh.service.HospitalSetService;

@Service
public class HospitalSetServiceImpl extends ServiceImpl<HospitalSetMapper, HospitalSet> implements HospitalSetService {

}
