package com.sovince.rpc.protocol;

import com.sovince.rpc.conf.CoreProperties;
import com.sovince.rpc.enums.Cmds;
import com.sovince.rpc.vo.ConnectStatus;
import org.apache.hadoop.ipc.VersionedProtocol;

/**
 * Created by vince
 * Email: so_vince@outlook.com
 * Data: 2019/6/16
 * Time: 20:04
 * Description:
 */
public interface BladeMasterProtocol extends VersionedProtocol {

    long versionID = CoreProperties.versionID;

    ConnectStatus connect(Cmds cmd);

    String begging(Cmds cmd);
}
