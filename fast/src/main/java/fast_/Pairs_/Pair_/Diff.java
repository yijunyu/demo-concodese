// automatically generated by the FlatBuffers compiler, do not modify

package fast_.Pairs_.Pair_;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class Diff extends Table {
  public static Diff getRootAsDiff(ByteBuffer _bb) { return getRootAsDiff(_bb, new Diff()); }
  public static Diff getRootAsDiff(ByteBuffer _bb, Diff obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; }
  public Diff __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public String project() { int o = __offset(4); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer projectAsByteBuffer() { return __vector_as_bytebuffer(4, 1); }
  public ByteBuffer projectInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 4, 1); }
  public int leftLine() { int o = __offset(6); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public int leftColumn() { int o = __offset(8); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public int rightLine() { int o = __offset(10); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public int rightColumn() { int o = __offset(12); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public fast_.Element oldCode() { return oldCode(new fast_.Element()); }
  public fast_.Element oldCode(fast_.Element obj) { int o = __offset(14); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }
  public fast_.Element newCode() { return newCode(new fast_.Element()); }
  public fast_.Element newCode(fast_.Element obj) { int o = __offset(16); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }
  public String hash() { int o = __offset(18); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer hashAsByteBuffer() { return __vector_as_bytebuffer(18, 1); }
  public ByteBuffer hashInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 18, 1); }
  public fast_.Slices slices() { return slices(new fast_.Slices()); }
  public fast_.Slices slices(fast_.Slices obj) { int o = __offset(20); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }

  public static int createDiff(FlatBufferBuilder builder,
      int projectOffset,
      int left_line,
      int left_column,
      int right_line,
      int right_column,
      int old_codeOffset,
      int new_codeOffset,
      int hashOffset,
      int slicesOffset) {
    builder.startObject(9);
    Diff.addSlices(builder, slicesOffset);
    Diff.addHash(builder, hashOffset);
    Diff.addNewCode(builder, new_codeOffset);
    Diff.addOldCode(builder, old_codeOffset);
    Diff.addRightColumn(builder, right_column);
    Diff.addRightLine(builder, right_line);
    Diff.addLeftColumn(builder, left_column);
    Diff.addLeftLine(builder, left_line);
    Diff.addProject(builder, projectOffset);
    return Diff.endDiff(builder);
  }

  public static void startDiff(FlatBufferBuilder builder) { builder.startObject(9); }
  public static void addProject(FlatBufferBuilder builder, int projectOffset) { builder.addOffset(0, projectOffset, 0); }
  public static void addLeftLine(FlatBufferBuilder builder, int leftLine) { builder.addInt(1, leftLine, 0); }
  public static void addLeftColumn(FlatBufferBuilder builder, int leftColumn) { builder.addInt(2, leftColumn, 0); }
  public static void addRightLine(FlatBufferBuilder builder, int rightLine) { builder.addInt(3, rightLine, 0); }
  public static void addRightColumn(FlatBufferBuilder builder, int rightColumn) { builder.addInt(4, rightColumn, 0); }
  public static void addOldCode(FlatBufferBuilder builder, int oldCodeOffset) { builder.addOffset(5, oldCodeOffset, 0); }
  public static void addNewCode(FlatBufferBuilder builder, int newCodeOffset) { builder.addOffset(6, newCodeOffset, 0); }
  public static void addHash(FlatBufferBuilder builder, int hashOffset) { builder.addOffset(7, hashOffset, 0); }
  public static void addSlices(FlatBufferBuilder builder, int slicesOffset) { builder.addOffset(8, slicesOffset, 0); }
  public static int endDiff(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
}

