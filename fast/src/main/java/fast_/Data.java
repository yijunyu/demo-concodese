// automatically generated by the FlatBuffers compiler, do not modify

package fast_;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class Data extends Table {
  public static Data getRootAsData(ByteBuffer _bb) { return getRootAsData(_bb, new Data()); }
  public static Data getRootAsData(ByteBuffer _bb, Data obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; }
  public Data __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public fast_.Data_.Anonymous3 RecordType() { return RecordType(new fast_.Data_.Anonymous3()); }
  public fast_.Data_.Anonymous3 RecordType(fast_.Data_.Anonymous3 obj) { int o = __offset(4); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }

  public static int createData(FlatBufferBuilder builder,
      int RecordTypeOffset) {
    builder.startObject(1);
    Data.addRecordType(builder, RecordTypeOffset);
    return Data.endData(builder);
  }

  public static void startData(FlatBufferBuilder builder) { builder.startObject(1); }
  public static void addRecordType(FlatBufferBuilder builder, int RecordTypeOffset) { builder.addOffset(0, RecordTypeOffset, 0); }
  public static int endData(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
}

