// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import java.util.Collections;
import java.util.Collection;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.Message;
import java.io.InputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.CodedOutputStream;
import java.util.List;
import com.google.protobuf.ByteString;
import java.io.IOException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Parser;
import com.google.protobuf.Internal;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class MusicBriefInfoOuterClass
{
    private static final Descriptors.Descriptor internal_static_MusicBriefInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_MusicBriefInfo_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private MusicBriefInfoOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return MusicBriefInfoOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0014MusicBriefInfo.proto\"\u00eb\u0003\n\u000eMusicBriefInfo\u0012\u0016\n\u000emusic_share_id\u0018\u0004 \u0001(\u0004\u0012\u0010\n\bmusic_id\u0018\u0002 \u0001(\r\u0012\u0017\n\u000fauthor_nickname\u0018\n \u0001(\t\u0012\u0018\n\u0010music_note_count\u0018\u0007 \u0001(\r\u0012\u0011\n\tmax_score\u0018\u000e \u0001(\r\u0012\r\n\u0005score\u0018\u0006 \u0001(\r\u0012\u0013\n\u000bcreate_time\u0018\u0003 \u0001(\r\u0012\u0012\n\nshare_time\u0018\r \u0001(\r\u0012\u0010\n\bposition\u0018\f \u0001(\r\u0012\u000e\n\u0006settle\u0018\u0001 \u0001(\b\u0012\u000f\n\u0007version\u0018\u000f \u0001(\r\u0012\u0011\n\tcan_share\u0018\b \u0001(\b\u0012\u001b\n\u0013Unk2700_DNLEGADDHKM\u0018\u000b \u0001(\b\u0012\u001b\n\u0013Unk2700_GBCGGDONMCD\u0018\t \u0001(\b\u0012\u001b\n\u0013Unk2700_JNENCBCGPGO\u0018\u0005 \u0001(\u0004\u0012\u001c\n\u0013Unk2700_MKBNLEKMIMD\u0018\u009e\t \u0001(\r\u0012\u001c\n\u0013Unk2700_JAEONBMBFJJ\u0018\u00d6\u0007 \u0003(\r\u0012\u001c\n\u0013Unk2700_GDCGOMNBMEO\u0018\u00ea\u0007 \u0003(\r\u0012\u001c\n\u0013Unk2700_KAMOCHAKPGP\u0018\u00c0\u0004 \u0001(\r\u0012\u001c\n\u0013Unk2700_LPEKFJBNEJM\u0018\u009e\u000e \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        MusicBriefInfoOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_MusicBriefInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_MusicBriefInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(MusicBriefInfoOuterClass.internal_static_MusicBriefInfo_descriptor, new String[] { "MusicShareId", "MusicId", "AuthorNickname", "MusicNoteCount", "MaxScore", "Score", "CreateTime", "ShareTime", "Position", "Settle", "Version", "CanShare", "Unk2700DNLEGADDHKM", "Unk2700GBCGGDONMCD", "Unk2700JNENCBCGPGO", "Unk2700MKBNLEKMIMD", "Unk2700JAEONBMBFJJ", "Unk2700GDCGOMNBMEO", "Unk2700KAMOCHAKPGP", "Unk2700LPEKFJBNEJM" });
    }
    
    public static final class MusicBriefInfo extends GeneratedMessageV3 implements MusicBriefInfoOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int MUSIC_SHARE_ID_FIELD_NUMBER = 4;
        private long musicShareId_;
        public static final int MUSIC_ID_FIELD_NUMBER = 2;
        private int musicId_;
        public static final int AUTHOR_NICKNAME_FIELD_NUMBER = 10;
        private volatile Object authorNickname_;
        public static final int MUSIC_NOTE_COUNT_FIELD_NUMBER = 7;
        private int musicNoteCount_;
        public static final int MAX_SCORE_FIELD_NUMBER = 14;
        private int maxScore_;
        public static final int SCORE_FIELD_NUMBER = 6;
        private int score_;
        public static final int CREATE_TIME_FIELD_NUMBER = 3;
        private int createTime_;
        public static final int SHARE_TIME_FIELD_NUMBER = 13;
        private int shareTime_;
        public static final int POSITION_FIELD_NUMBER = 12;
        private int position_;
        public static final int SETTLE_FIELD_NUMBER = 1;
        private boolean settle_;
        public static final int VERSION_FIELD_NUMBER = 15;
        private int version_;
        public static final int CAN_SHARE_FIELD_NUMBER = 8;
        private boolean canShare_;
        public static final int UNK2700_DNLEGADDHKM_FIELD_NUMBER = 11;
        private boolean unk2700DNLEGADDHKM_;
        public static final int UNK2700_GBCGGDONMCD_FIELD_NUMBER = 9;
        private boolean unk2700GBCGGDONMCD_;
        public static final int UNK2700_JNENCBCGPGO_FIELD_NUMBER = 5;
        private long unk2700JNENCBCGPGO_;
        public static final int UNK2700_MKBNLEKMIMD_FIELD_NUMBER = 1182;
        private int unk2700MKBNLEKMIMD_;
        public static final int UNK2700_JAEONBMBFJJ_FIELD_NUMBER = 982;
        private Internal.IntList unk2700JAEONBMBFJJ_;
        private int unk2700JAEONBMBFJJMemoizedSerializedSize;
        public static final int UNK2700_GDCGOMNBMEO_FIELD_NUMBER = 1002;
        private Internal.IntList unk2700GDCGOMNBMEO_;
        private int unk2700GDCGOMNBMEOMemoizedSerializedSize;
        public static final int UNK2700_KAMOCHAKPGP_FIELD_NUMBER = 576;
        private int unk2700KAMOCHAKPGP_;
        public static final int UNK2700_LPEKFJBNEJM_FIELD_NUMBER = 1822;
        private int unk2700LPEKFJBNEJM_;
        private byte memoizedIsInitialized;
        private static final MusicBriefInfo DEFAULT_INSTANCE;
        private static final Parser<MusicBriefInfo> PARSER;
        
        private MusicBriefInfo(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.unk2700JAEONBMBFJJMemoizedSerializedSize = -1;
            this.unk2700GDCGOMNBMEOMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
        }
        
        private MusicBriefInfo() {
            this.unk2700JAEONBMBFJJMemoizedSerializedSize = -1;
            this.unk2700GDCGOMNBMEOMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.authorNickname_ = "";
            this.unk2700JAEONBMBFJJ_ = GeneratedMessageV3.emptyIntList();
            this.unk2700GDCGOMNBMEO_ = GeneratedMessageV3.emptyIntList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new MusicBriefInfo();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private MusicBriefInfo(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new NullPointerException();
            }
            int mutable_bitField0_ = 0;
            final UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    final int tag = input.readTag();
                    switch (tag) {
                        case 0: {
                            done = true;
                            continue;
                        }
                        case 8: {
                            this.settle_ = input.readBool();
                            continue;
                        }
                        case 16: {
                            this.musicId_ = input.readUInt32();
                            continue;
                        }
                        case 24: {
                            this.createTime_ = input.readUInt32();
                            continue;
                        }
                        case 32: {
                            this.musicShareId_ = input.readUInt64();
                            continue;
                        }
                        case 40: {
                            this.unk2700JNENCBCGPGO_ = input.readUInt64();
                            continue;
                        }
                        case 48: {
                            this.score_ = input.readUInt32();
                            continue;
                        }
                        case 56: {
                            this.musicNoteCount_ = input.readUInt32();
                            continue;
                        }
                        case 64: {
                            this.canShare_ = input.readBool();
                            continue;
                        }
                        case 72: {
                            this.unk2700GBCGGDONMCD_ = input.readBool();
                            continue;
                        }
                        case 82: {
                            final String s = input.readStringRequireUtf8();
                            this.authorNickname_ = s;
                            continue;
                        }
                        case 88: {
                            this.unk2700DNLEGADDHKM_ = input.readBool();
                            continue;
                        }
                        case 96: {
                            this.position_ = input.readUInt32();
                            continue;
                        }
                        case 104: {
                            this.shareTime_ = input.readUInt32();
                            continue;
                        }
                        case 112: {
                            this.maxScore_ = input.readUInt32();
                            continue;
                        }
                        case 120: {
                            this.version_ = input.readUInt32();
                            continue;
                        }
                        case 4608: {
                            this.unk2700KAMOCHAKPGP_ = input.readUInt32();
                            continue;
                        }
                        case 7856: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.unk2700JAEONBMBFJJ_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.unk2700JAEONBMBFJJ_.addInt(input.readUInt32());
                            continue;
                        }
                        case 7858: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x1) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.unk2700JAEONBMBFJJ_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.unk2700JAEONBMBFJJ_.addInt(input.readUInt32());
                            }
                            input.popLimit(limit);
                            continue;
                        }
                        case 8016: {
                            if ((mutable_bitField0_ & 0x2) == 0x0) {
                                this.unk2700GDCGOMNBMEO_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x2;
                            }
                            this.unk2700GDCGOMNBMEO_.addInt(input.readUInt32());
                            continue;
                        }
                        case 8018: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x2) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.unk2700GDCGOMNBMEO_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x2;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.unk2700GDCGOMNBMEO_.addInt(input.readUInt32());
                            }
                            input.popLimit(limit);
                            continue;
                        }
                        case 9456: {
                            this.unk2700MKBNLEKMIMD_ = input.readUInt32();
                            continue;
                        }
                        case 14576: {
                            this.unk2700LPEKFJBNEJM_ = input.readUInt32();
                            continue;
                        }
                        default: {
                            if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                                done = true;
                                continue;
                            }
                            continue;
                        }
                    }
                }
            }
            catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            }
            catch (IOException e2) {
                throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
            }
            finally {
                if ((mutable_bitField0_ & 0x1) != 0x0) {
                    this.unk2700JAEONBMBFJJ_.makeImmutable();
                }
                if ((mutable_bitField0_ & 0x2) != 0x0) {
                    this.unk2700GDCGOMNBMEO_.makeImmutable();
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return MusicBriefInfoOuterClass.internal_static_MusicBriefInfo_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return MusicBriefInfoOuterClass.internal_static_MusicBriefInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(MusicBriefInfo.class, Builder.class);
        }
        
        @Override
        public long getMusicShareId() {
            return this.musicShareId_;
        }
        
        @Override
        public int getMusicId() {
            return this.musicId_;
        }
        
        @Override
        public String getAuthorNickname() {
            final Object ref = this.authorNickname_;
            if (ref instanceof String) {
                return (String)ref;
            }
            final ByteString bs = (ByteString)ref;
            final String s = bs.toStringUtf8();
            return (String)(this.authorNickname_ = s);
        }
        
        @Override
        public ByteString getAuthorNicknameBytes() {
            final Object ref = this.authorNickname_;
            if (ref instanceof String) {
                final ByteString b = ByteString.copyFromUtf8((String)ref);
                return (ByteString)(this.authorNickname_ = b);
            }
            return (ByteString)ref;
        }
        
        @Override
        public int getMusicNoteCount() {
            return this.musicNoteCount_;
        }
        
        @Override
        public int getMaxScore() {
            return this.maxScore_;
        }
        
        @Override
        public int getScore() {
            return this.score_;
        }
        
        @Override
        public int getCreateTime() {
            return this.createTime_;
        }
        
        @Override
        public int getShareTime() {
            return this.shareTime_;
        }
        
        @Override
        public int getPosition() {
            return this.position_;
        }
        
        @Override
        public boolean getSettle() {
            return this.settle_;
        }
        
        @Override
        public int getVersion() {
            return this.version_;
        }
        
        @Override
        public boolean getCanShare() {
            return this.canShare_;
        }
        
        @Override
        public boolean getUnk2700DNLEGADDHKM() {
            return this.unk2700DNLEGADDHKM_;
        }
        
        @Override
        public boolean getUnk2700GBCGGDONMCD() {
            return this.unk2700GBCGGDONMCD_;
        }
        
        @Override
        public long getUnk2700JNENCBCGPGO() {
            return this.unk2700JNENCBCGPGO_;
        }
        
        @Override
        public int getUnk2700MKBNLEKMIMD() {
            return this.unk2700MKBNLEKMIMD_;
        }
        
        @Override
        public List<Integer> getUnk2700JAEONBMBFJJList() {
            return this.unk2700JAEONBMBFJJ_;
        }
        
        @Override
        public int getUnk2700JAEONBMBFJJCount() {
            return this.unk2700JAEONBMBFJJ_.size();
        }
        
        @Override
        public int getUnk2700JAEONBMBFJJ(final int index) {
            return this.unk2700JAEONBMBFJJ_.getInt(index);
        }
        
        @Override
        public List<Integer> getUnk2700GDCGOMNBMEOList() {
            return this.unk2700GDCGOMNBMEO_;
        }
        
        @Override
        public int getUnk2700GDCGOMNBMEOCount() {
            return this.unk2700GDCGOMNBMEO_.size();
        }
        
        @Override
        public int getUnk2700GDCGOMNBMEO(final int index) {
            return this.unk2700GDCGOMNBMEO_.getInt(index);
        }
        
        @Override
        public int getUnk2700KAMOCHAKPGP() {
            return this.unk2700KAMOCHAKPGP_;
        }
        
        @Override
        public int getUnk2700LPEKFJBNEJM() {
            return this.unk2700LPEKFJBNEJM_;
        }
        
        @Override
        public final boolean isInitialized() {
            final byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) {
                return true;
            }
            if (isInitialized == 0) {
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }
        
        @Override
        public void writeTo(final CodedOutputStream output) throws IOException {
            this.getSerializedSize();
            if (this.settle_) {
                output.writeBool(1, this.settle_);
            }
            if (this.musicId_ != 0) {
                output.writeUInt32(2, this.musicId_);
            }
            if (this.createTime_ != 0) {
                output.writeUInt32(3, this.createTime_);
            }
            if (this.musicShareId_ != 0L) {
                output.writeUInt64(4, this.musicShareId_);
            }
            if (this.unk2700JNENCBCGPGO_ != 0L) {
                output.writeUInt64(5, this.unk2700JNENCBCGPGO_);
            }
            if (this.score_ != 0) {
                output.writeUInt32(6, this.score_);
            }
            if (this.musicNoteCount_ != 0) {
                output.writeUInt32(7, this.musicNoteCount_);
            }
            if (this.canShare_) {
                output.writeBool(8, this.canShare_);
            }
            if (this.unk2700GBCGGDONMCD_) {
                output.writeBool(9, this.unk2700GBCGGDONMCD_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.authorNickname_)) {
                GeneratedMessageV3.writeString(output, 10, this.authorNickname_);
            }
            if (this.unk2700DNLEGADDHKM_) {
                output.writeBool(11, this.unk2700DNLEGADDHKM_);
            }
            if (this.position_ != 0) {
                output.writeUInt32(12, this.position_);
            }
            if (this.shareTime_ != 0) {
                output.writeUInt32(13, this.shareTime_);
            }
            if (this.maxScore_ != 0) {
                output.writeUInt32(14, this.maxScore_);
            }
            if (this.version_ != 0) {
                output.writeUInt32(15, this.version_);
            }
            if (this.unk2700KAMOCHAKPGP_ != 0) {
                output.writeUInt32(576, this.unk2700KAMOCHAKPGP_);
            }
            if (this.getUnk2700JAEONBMBFJJList().size() > 0) {
                output.writeUInt32NoTag(7858);
                output.writeUInt32NoTag(this.unk2700JAEONBMBFJJMemoizedSerializedSize);
            }
            for (int i = 0; i < this.unk2700JAEONBMBFJJ_.size(); ++i) {
                output.writeUInt32NoTag(this.unk2700JAEONBMBFJJ_.getInt(i));
            }
            if (this.getUnk2700GDCGOMNBMEOList().size() > 0) {
                output.writeUInt32NoTag(8018);
                output.writeUInt32NoTag(this.unk2700GDCGOMNBMEOMemoizedSerializedSize);
            }
            for (int i = 0; i < this.unk2700GDCGOMNBMEO_.size(); ++i) {
                output.writeUInt32NoTag(this.unk2700GDCGOMNBMEO_.getInt(i));
            }
            if (this.unk2700MKBNLEKMIMD_ != 0) {
                output.writeUInt32(1182, this.unk2700MKBNLEKMIMD_);
            }
            if (this.unk2700LPEKFJBNEJM_ != 0) {
                output.writeUInt32(1822, this.unk2700LPEKFJBNEJM_);
            }
            this.unknownFields.writeTo(output);
        }
        
        @Override
        public int getSerializedSize() {
            int size = this.memoizedSize;
            if (size != -1) {
                return size;
            }
            size = 0;
            if (this.settle_) {
                size += CodedOutputStream.computeBoolSize(1, this.settle_);
            }
            if (this.musicId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(2, this.musicId_);
            }
            if (this.createTime_ != 0) {
                size += CodedOutputStream.computeUInt32Size(3, this.createTime_);
            }
            if (this.musicShareId_ != 0L) {
                size += CodedOutputStream.computeUInt64Size(4, this.musicShareId_);
            }
            if (this.unk2700JNENCBCGPGO_ != 0L) {
                size += CodedOutputStream.computeUInt64Size(5, this.unk2700JNENCBCGPGO_);
            }
            if (this.score_ != 0) {
                size += CodedOutputStream.computeUInt32Size(6, this.score_);
            }
            if (this.musicNoteCount_ != 0) {
                size += CodedOutputStream.computeUInt32Size(7, this.musicNoteCount_);
            }
            if (this.canShare_) {
                size += CodedOutputStream.computeBoolSize(8, this.canShare_);
            }
            if (this.unk2700GBCGGDONMCD_) {
                size += CodedOutputStream.computeBoolSize(9, this.unk2700GBCGGDONMCD_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.authorNickname_)) {
                size += GeneratedMessageV3.computeStringSize(10, this.authorNickname_);
            }
            if (this.unk2700DNLEGADDHKM_) {
                size += CodedOutputStream.computeBoolSize(11, this.unk2700DNLEGADDHKM_);
            }
            if (this.position_ != 0) {
                size += CodedOutputStream.computeUInt32Size(12, this.position_);
            }
            if (this.shareTime_ != 0) {
                size += CodedOutputStream.computeUInt32Size(13, this.shareTime_);
            }
            if (this.maxScore_ != 0) {
                size += CodedOutputStream.computeUInt32Size(14, this.maxScore_);
            }
            if (this.version_ != 0) {
                size += CodedOutputStream.computeUInt32Size(15, this.version_);
            }
            if (this.unk2700KAMOCHAKPGP_ != 0) {
                size += CodedOutputStream.computeUInt32Size(576, this.unk2700KAMOCHAKPGP_);
            }
            int dataSize = 0;
            for (int i = 0; i < this.unk2700JAEONBMBFJJ_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.unk2700JAEONBMBFJJ_.getInt(i));
            }
            size += dataSize;
            if (!this.getUnk2700JAEONBMBFJJList().isEmpty()) {
                size += 2;
                size += CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.unk2700JAEONBMBFJJMemoizedSerializedSize = dataSize;
            dataSize = 0;
            for (int i = 0; i < this.unk2700GDCGOMNBMEO_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.unk2700GDCGOMNBMEO_.getInt(i));
            }
            size += dataSize;
            if (!this.getUnk2700GDCGOMNBMEOList().isEmpty()) {
                size += 2;
                size += CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.unk2700GDCGOMNBMEOMemoizedSerializedSize = dataSize;
            if (this.unk2700MKBNLEKMIMD_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1182, this.unk2700MKBNLEKMIMD_);
            }
            if (this.unk2700LPEKFJBNEJM_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1822, this.unk2700LPEKFJBNEJM_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MusicBriefInfo)) {
                return super.equals(obj);
            }
            final MusicBriefInfo other = (MusicBriefInfo)obj;
            return this.getMusicShareId() == other.getMusicShareId() && this.getMusicId() == other.getMusicId() && this.getAuthorNickname().equals(other.getAuthorNickname()) && this.getMusicNoteCount() == other.getMusicNoteCount() && this.getMaxScore() == other.getMaxScore() && this.getScore() == other.getScore() && this.getCreateTime() == other.getCreateTime() && this.getShareTime() == other.getShareTime() && this.getPosition() == other.getPosition() && this.getSettle() == other.getSettle() && this.getVersion() == other.getVersion() && this.getCanShare() == other.getCanShare() && this.getUnk2700DNLEGADDHKM() == other.getUnk2700DNLEGADDHKM() && this.getUnk2700GBCGGDONMCD() == other.getUnk2700GBCGGDONMCD() && this.getUnk2700JNENCBCGPGO() == other.getUnk2700JNENCBCGPGO() && this.getUnk2700MKBNLEKMIMD() == other.getUnk2700MKBNLEKMIMD() && this.getUnk2700JAEONBMBFJJList().equals(other.getUnk2700JAEONBMBFJJList()) && this.getUnk2700GDCGOMNBMEOList().equals(other.getUnk2700GDCGOMNBMEOList()) && this.getUnk2700KAMOCHAKPGP() == other.getUnk2700KAMOCHAKPGP() && this.getUnk2700LPEKFJBNEJM() == other.getUnk2700LPEKFJBNEJM() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 4;
            hash = 53 * hash + Internal.hashLong(this.getMusicShareId());
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getMusicId();
            hash = 37 * hash + 10;
            hash = 53 * hash + this.getAuthorNickname().hashCode();
            hash = 37 * hash + 7;
            hash = 53 * hash + this.getMusicNoteCount();
            hash = 37 * hash + 14;
            hash = 53 * hash + this.getMaxScore();
            hash = 37 * hash + 6;
            hash = 53 * hash + this.getScore();
            hash = 37 * hash + 3;
            hash = 53 * hash + this.getCreateTime();
            hash = 37 * hash + 13;
            hash = 53 * hash + this.getShareTime();
            hash = 37 * hash + 12;
            hash = 53 * hash + this.getPosition();
            hash = 37 * hash + 1;
            hash = 53 * hash + Internal.hashBoolean(this.getSettle());
            hash = 37 * hash + 15;
            hash = 53 * hash + this.getVersion();
            hash = 37 * hash + 8;
            hash = 53 * hash + Internal.hashBoolean(this.getCanShare());
            hash = 37 * hash + 11;
            hash = 53 * hash + Internal.hashBoolean(this.getUnk2700DNLEGADDHKM());
            hash = 37 * hash + 9;
            hash = 53 * hash + Internal.hashBoolean(this.getUnk2700GBCGGDONMCD());
            hash = 37 * hash + 5;
            hash = 53 * hash + Internal.hashLong(this.getUnk2700JNENCBCGPGO());
            hash = 37 * hash + 1182;
            hash = 53 * hash + this.getUnk2700MKBNLEKMIMD();
            if (this.getUnk2700JAEONBMBFJJCount() > 0) {
                hash = 37 * hash + 982;
                hash = 53 * hash + this.getUnk2700JAEONBMBFJJList().hashCode();
            }
            if (this.getUnk2700GDCGOMNBMEOCount() > 0) {
                hash = 37 * hash + 1002;
                hash = 53 * hash + this.getUnk2700GDCGOMNBMEOList().hashCode();
            }
            hash = 37 * hash + 576;
            hash = 53 * hash + this.getUnk2700KAMOCHAKPGP();
            hash = 37 * hash + 1822;
            hash = 53 * hash + this.getUnk2700LPEKFJBNEJM();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static MusicBriefInfo parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return MusicBriefInfo.PARSER.parseFrom(data);
        }
        
        public static MusicBriefInfo parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return MusicBriefInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static MusicBriefInfo parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return MusicBriefInfo.PARSER.parseFrom(data);
        }
        
        public static MusicBriefInfo parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return MusicBriefInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static MusicBriefInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return MusicBriefInfo.PARSER.parseFrom(data);
        }
        
        public static MusicBriefInfo parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return MusicBriefInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static MusicBriefInfo parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MusicBriefInfo.PARSER, input);
        }
        
        public static MusicBriefInfo parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MusicBriefInfo.PARSER, input, extensionRegistry);
        }
        
        public static MusicBriefInfo parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(MusicBriefInfo.PARSER, input);
        }
        
        public static MusicBriefInfo parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(MusicBriefInfo.PARSER, input, extensionRegistry);
        }
        
        public static MusicBriefInfo parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MusicBriefInfo.PARSER, input);
        }
        
        public static MusicBriefInfo parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MusicBriefInfo.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return MusicBriefInfo.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final MusicBriefInfo prototype) {
            return MusicBriefInfo.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == MusicBriefInfo.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static MusicBriefInfo getDefaultInstance() {
            return MusicBriefInfo.DEFAULT_INSTANCE;
        }
        
        public static Parser<MusicBriefInfo> parser() {
            return MusicBriefInfo.PARSER;
        }
        
        @Override
        public Parser<MusicBriefInfo> getParserForType() {
            return MusicBriefInfo.PARSER;
        }
        
        @Override
        public MusicBriefInfo getDefaultInstanceForType() {
            return MusicBriefInfo.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new MusicBriefInfo();
            PARSER = new AbstractParser<MusicBriefInfo>() {
                @Override
                public MusicBriefInfo parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new MusicBriefInfo(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements MusicBriefInfoOrBuilder
        {
            private int bitField0_;
            private long musicShareId_;
            private int musicId_;
            private Object authorNickname_;
            private int musicNoteCount_;
            private int maxScore_;
            private int score_;
            private int createTime_;
            private int shareTime_;
            private int position_;
            private boolean settle_;
            private int version_;
            private boolean canShare_;
            private boolean unk2700DNLEGADDHKM_;
            private boolean unk2700GBCGGDONMCD_;
            private long unk2700JNENCBCGPGO_;
            private int unk2700MKBNLEKMIMD_;
            private Internal.IntList unk2700JAEONBMBFJJ_;
            private Internal.IntList unk2700GDCGOMNBMEO_;
            private int unk2700KAMOCHAKPGP_;
            private int unk2700LPEKFJBNEJM_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return MusicBriefInfoOuterClass.internal_static_MusicBriefInfo_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return MusicBriefInfoOuterClass.internal_static_MusicBriefInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(MusicBriefInfo.class, Builder.class);
            }
            
            private Builder() {
                this.authorNickname_ = "";
                this.unk2700JAEONBMBFJJ_ = GeneratedMessageV3.emptyIntList();
                this.unk2700GDCGOMNBMEO_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.authorNickname_ = "";
                this.unk2700JAEONBMBFJJ_ = GeneratedMessageV3.emptyIntList();
                this.unk2700GDCGOMNBMEO_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (MusicBriefInfo.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.musicShareId_ = 0L;
                this.musicId_ = 0;
                this.authorNickname_ = "";
                this.musicNoteCount_ = 0;
                this.maxScore_ = 0;
                this.score_ = 0;
                this.createTime_ = 0;
                this.shareTime_ = 0;
                this.position_ = 0;
                this.settle_ = false;
                this.version_ = 0;
                this.canShare_ = false;
                this.unk2700DNLEGADDHKM_ = false;
                this.unk2700GBCGGDONMCD_ = false;
                this.unk2700JNENCBCGPGO_ = 0L;
                this.unk2700MKBNLEKMIMD_ = 0;
                this.unk2700JAEONBMBFJJ_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                this.unk2700GDCGOMNBMEO_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFD;
                this.unk2700KAMOCHAKPGP_ = 0;
                this.unk2700LPEKFJBNEJM_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return MusicBriefInfoOuterClass.internal_static_MusicBriefInfo_descriptor;
            }
            
            @Override
            public MusicBriefInfo getDefaultInstanceForType() {
                return MusicBriefInfo.getDefaultInstance();
            }
            
            @Override
            public MusicBriefInfo build() {
                final MusicBriefInfo result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public MusicBriefInfo buildPartial() {
                final MusicBriefInfo result = new MusicBriefInfo(this);
                final int from_bitField0_ = this.bitField0_;
                result.musicShareId_ = this.musicShareId_;
                result.musicId_ = this.musicId_;
                result.authorNickname_ = this.authorNickname_;
                result.musicNoteCount_ = this.musicNoteCount_;
                result.maxScore_ = this.maxScore_;
                result.score_ = this.score_;
                result.createTime_ = this.createTime_;
                result.shareTime_ = this.shareTime_;
                result.position_ = this.position_;
                result.settle_ = this.settle_;
                result.version_ = this.version_;
                result.canShare_ = this.canShare_;
                result.unk2700DNLEGADDHKM_ = this.unk2700DNLEGADDHKM_;
                result.unk2700GBCGGDONMCD_ = this.unk2700GBCGGDONMCD_;
                result.unk2700JNENCBCGPGO_ = this.unk2700JNENCBCGPGO_;
                result.unk2700MKBNLEKMIMD_ = this.unk2700MKBNLEKMIMD_;
                if ((this.bitField0_ & 0x1) != 0x0) {
                    this.unk2700JAEONBMBFJJ_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                result.unk2700JAEONBMBFJJ_ = this.unk2700JAEONBMBFJJ_;
                if ((this.bitField0_ & 0x2) != 0x0) {
                    this.unk2700GDCGOMNBMEO_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFD;
                }
                result.unk2700GDCGOMNBMEO_ = this.unk2700GDCGOMNBMEO_;
                result.unk2700KAMOCHAKPGP_ = this.unk2700KAMOCHAKPGP_;
                result.unk2700LPEKFJBNEJM_ = this.unk2700LPEKFJBNEJM_;
                this.onBuilt();
                return result;
            }
            
            @Override
            public Builder clone() {
                return super.clone();
            }
            
            @Override
            public Builder setField(final Descriptors.FieldDescriptor field, final Object value) {
                return super.setField(field, value);
            }
            
            @Override
            public Builder clearField(final Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }
            
            @Override
            public Builder clearOneof(final Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }
            
            @Override
            public Builder setRepeatedField(final Descriptors.FieldDescriptor field, final int index, final Object value) {
                return super.setRepeatedField(field, index, value);
            }
            
            @Override
            public Builder addRepeatedField(final Descriptors.FieldDescriptor field, final Object value) {
                return super.addRepeatedField(field, value);
            }
            
            @Override
            public Builder mergeFrom(final Message other) {
                if (other instanceof MusicBriefInfo) {
                    return this.mergeFrom((MusicBriefInfo)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final MusicBriefInfo other) {
                if (other == MusicBriefInfo.getDefaultInstance()) {
                    return this;
                }
                if (other.getMusicShareId() != 0L) {
                    this.setMusicShareId(other.getMusicShareId());
                }
                if (other.getMusicId() != 0) {
                    this.setMusicId(other.getMusicId());
                }
                if (!other.getAuthorNickname().isEmpty()) {
                    this.authorNickname_ = other.authorNickname_;
                    this.onChanged();
                }
                if (other.getMusicNoteCount() != 0) {
                    this.setMusicNoteCount(other.getMusicNoteCount());
                }
                if (other.getMaxScore() != 0) {
                    this.setMaxScore(other.getMaxScore());
                }
                if (other.getScore() != 0) {
                    this.setScore(other.getScore());
                }
                if (other.getCreateTime() != 0) {
                    this.setCreateTime(other.getCreateTime());
                }
                if (other.getShareTime() != 0) {
                    this.setShareTime(other.getShareTime());
                }
                if (other.getPosition() != 0) {
                    this.setPosition(other.getPosition());
                }
                if (other.getSettle()) {
                    this.setSettle(other.getSettle());
                }
                if (other.getVersion() != 0) {
                    this.setVersion(other.getVersion());
                }
                if (other.getCanShare()) {
                    this.setCanShare(other.getCanShare());
                }
                if (other.getUnk2700DNLEGADDHKM()) {
                    this.setUnk2700DNLEGADDHKM(other.getUnk2700DNLEGADDHKM());
                }
                if (other.getUnk2700GBCGGDONMCD()) {
                    this.setUnk2700GBCGGDONMCD(other.getUnk2700GBCGGDONMCD());
                }
                if (other.getUnk2700JNENCBCGPGO() != 0L) {
                    this.setUnk2700JNENCBCGPGO(other.getUnk2700JNENCBCGPGO());
                }
                if (other.getUnk2700MKBNLEKMIMD() != 0) {
                    this.setUnk2700MKBNLEKMIMD(other.getUnk2700MKBNLEKMIMD());
                }
                if (!other.unk2700JAEONBMBFJJ_.isEmpty()) {
                    if (this.unk2700JAEONBMBFJJ_.isEmpty()) {
                        this.unk2700JAEONBMBFJJ_ = other.unk2700JAEONBMBFJJ_;
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    else {
                        this.ensureUnk2700JAEONBMBFJJIsMutable();
                        this.unk2700JAEONBMBFJJ_.addAll(other.unk2700JAEONBMBFJJ_);
                    }
                    this.onChanged();
                }
                if (!other.unk2700GDCGOMNBMEO_.isEmpty()) {
                    if (this.unk2700GDCGOMNBMEO_.isEmpty()) {
                        this.unk2700GDCGOMNBMEO_ = other.unk2700GDCGOMNBMEO_;
                        this.bitField0_ &= 0xFFFFFFFD;
                    }
                    else {
                        this.ensureUnk2700GDCGOMNBMEOIsMutable();
                        this.unk2700GDCGOMNBMEO_.addAll(other.unk2700GDCGOMNBMEO_);
                    }
                    this.onChanged();
                }
                if (other.getUnk2700KAMOCHAKPGP() != 0) {
                    this.setUnk2700KAMOCHAKPGP(other.getUnk2700KAMOCHAKPGP());
                }
                if (other.getUnk2700LPEKFJBNEJM() != 0) {
                    this.setUnk2700LPEKFJBNEJM(other.getUnk2700LPEKFJBNEJM());
                }
                this.mergeUnknownFields(other.unknownFields);
                this.onChanged();
                return this;
            }
            
            @Override
            public final boolean isInitialized() {
                return true;
            }
            
            @Override
            public Builder mergeFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
                MusicBriefInfo parsedMessage = null;
                try {
                    parsedMessage = MusicBriefInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (MusicBriefInfo)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            @Override
            public long getMusicShareId() {
                return this.musicShareId_;
            }
            
            public Builder setMusicShareId(final long value) {
                this.musicShareId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearMusicShareId() {
                this.musicShareId_ = 0L;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getMusicId() {
                return this.musicId_;
            }
            
            public Builder setMusicId(final int value) {
                this.musicId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearMusicId() {
                this.musicId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public String getAuthorNickname() {
                final Object ref = this.authorNickname_;
                if (!(ref instanceof String)) {
                    final ByteString bs = (ByteString)ref;
                    final String s = bs.toStringUtf8();
                    return (String)(this.authorNickname_ = s);
                }
                return (String)ref;
            }
            
            @Override
            public ByteString getAuthorNicknameBytes() {
                final Object ref = this.authorNickname_;
                if (ref instanceof String) {
                    final ByteString b = ByteString.copyFromUtf8((String)ref);
                    return (ByteString)(this.authorNickname_ = b);
                }
                return (ByteString)ref;
            }
            
            public Builder setAuthorNickname(final String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.authorNickname_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearAuthorNickname() {
                this.authorNickname_ = MusicBriefInfo.getDefaultInstance().getAuthorNickname();
                this.onChanged();
                return this;
            }
            
            public Builder setAuthorNicknameBytes(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                AbstractMessageLite.checkByteStringIsUtf8(value);
                this.authorNickname_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getMusicNoteCount() {
                return this.musicNoteCount_;
            }
            
            public Builder setMusicNoteCount(final int value) {
                this.musicNoteCount_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearMusicNoteCount() {
                this.musicNoteCount_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getMaxScore() {
                return this.maxScore_;
            }
            
            public Builder setMaxScore(final int value) {
                this.maxScore_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearMaxScore() {
                this.maxScore_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getScore() {
                return this.score_;
            }
            
            public Builder setScore(final int value) {
                this.score_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearScore() {
                this.score_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getCreateTime() {
                return this.createTime_;
            }
            
            public Builder setCreateTime(final int value) {
                this.createTime_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearCreateTime() {
                this.createTime_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getShareTime() {
                return this.shareTime_;
            }
            
            public Builder setShareTime(final int value) {
                this.shareTime_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearShareTime() {
                this.shareTime_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getPosition() {
                return this.position_;
            }
            
            public Builder setPosition(final int value) {
                this.position_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearPosition() {
                this.position_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean getSettle() {
                return this.settle_;
            }
            
            public Builder setSettle(final boolean value) {
                this.settle_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearSettle() {
                this.settle_ = false;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getVersion() {
                return this.version_;
            }
            
            public Builder setVersion(final int value) {
                this.version_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearVersion() {
                this.version_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean getCanShare() {
                return this.canShare_;
            }
            
            public Builder setCanShare(final boolean value) {
                this.canShare_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearCanShare() {
                this.canShare_ = false;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean getUnk2700DNLEGADDHKM() {
                return this.unk2700DNLEGADDHKM_;
            }
            
            public Builder setUnk2700DNLEGADDHKM(final boolean value) {
                this.unk2700DNLEGADDHKM_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearUnk2700DNLEGADDHKM() {
                this.unk2700DNLEGADDHKM_ = false;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean getUnk2700GBCGGDONMCD() {
                return this.unk2700GBCGGDONMCD_;
            }
            
            public Builder setUnk2700GBCGGDONMCD(final boolean value) {
                this.unk2700GBCGGDONMCD_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearUnk2700GBCGGDONMCD() {
                this.unk2700GBCGGDONMCD_ = false;
                this.onChanged();
                return this;
            }
            
            @Override
            public long getUnk2700JNENCBCGPGO() {
                return this.unk2700JNENCBCGPGO_;
            }
            
            public Builder setUnk2700JNENCBCGPGO(final long value) {
                this.unk2700JNENCBCGPGO_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearUnk2700JNENCBCGPGO() {
                this.unk2700JNENCBCGPGO_ = 0L;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getUnk2700MKBNLEKMIMD() {
                return this.unk2700MKBNLEKMIMD_;
            }
            
            public Builder setUnk2700MKBNLEKMIMD(final int value) {
                this.unk2700MKBNLEKMIMD_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearUnk2700MKBNLEKMIMD() {
                this.unk2700MKBNLEKMIMD_ = 0;
                this.onChanged();
                return this;
            }
            
            private void ensureUnk2700JAEONBMBFJJIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.unk2700JAEONBMBFJJ_ = GeneratedMessageV3.mutableCopy(this.unk2700JAEONBMBFJJ_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<Integer> getUnk2700JAEONBMBFJJList() {
                return ((this.bitField0_ & 0x1) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.unk2700JAEONBMBFJJ_) : this.unk2700JAEONBMBFJJ_;
            }
            
            @Override
            public int getUnk2700JAEONBMBFJJCount() {
                return this.unk2700JAEONBMBFJJ_.size();
            }
            
            @Override
            public int getUnk2700JAEONBMBFJJ(final int index) {
                return this.unk2700JAEONBMBFJJ_.getInt(index);
            }
            
            public Builder setUnk2700JAEONBMBFJJ(final int index, final int value) {
                this.ensureUnk2700JAEONBMBFJJIsMutable();
                this.unk2700JAEONBMBFJJ_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addUnk2700JAEONBMBFJJ(final int value) {
                this.ensureUnk2700JAEONBMBFJJIsMutable();
                this.unk2700JAEONBMBFJJ_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllUnk2700JAEONBMBFJJ(final Iterable<? extends Integer> values) {
                this.ensureUnk2700JAEONBMBFJJIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.unk2700JAEONBMBFJJ_);
                this.onChanged();
                return this;
            }
            
            public Builder clearUnk2700JAEONBMBFJJ() {
                this.unk2700JAEONBMBFJJ_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                this.onChanged();
                return this;
            }
            
            private void ensureUnk2700GDCGOMNBMEOIsMutable() {
                if ((this.bitField0_ & 0x2) == 0x0) {
                    this.unk2700GDCGOMNBMEO_ = GeneratedMessageV3.mutableCopy(this.unk2700GDCGOMNBMEO_);
                    this.bitField0_ |= 0x2;
                }
            }
            
            @Override
            public List<Integer> getUnk2700GDCGOMNBMEOList() {
                return ((this.bitField0_ & 0x2) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.unk2700GDCGOMNBMEO_) : this.unk2700GDCGOMNBMEO_;
            }
            
            @Override
            public int getUnk2700GDCGOMNBMEOCount() {
                return this.unk2700GDCGOMNBMEO_.size();
            }
            
            @Override
            public int getUnk2700GDCGOMNBMEO(final int index) {
                return this.unk2700GDCGOMNBMEO_.getInt(index);
            }
            
            public Builder setUnk2700GDCGOMNBMEO(final int index, final int value) {
                this.ensureUnk2700GDCGOMNBMEOIsMutable();
                this.unk2700GDCGOMNBMEO_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addUnk2700GDCGOMNBMEO(final int value) {
                this.ensureUnk2700GDCGOMNBMEOIsMutable();
                this.unk2700GDCGOMNBMEO_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllUnk2700GDCGOMNBMEO(final Iterable<? extends Integer> values) {
                this.ensureUnk2700GDCGOMNBMEOIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.unk2700GDCGOMNBMEO_);
                this.onChanged();
                return this;
            }
            
            public Builder clearUnk2700GDCGOMNBMEO() {
                this.unk2700GDCGOMNBMEO_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFD;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getUnk2700KAMOCHAKPGP() {
                return this.unk2700KAMOCHAKPGP_;
            }
            
            public Builder setUnk2700KAMOCHAKPGP(final int value) {
                this.unk2700KAMOCHAKPGP_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearUnk2700KAMOCHAKPGP() {
                this.unk2700KAMOCHAKPGP_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getUnk2700LPEKFJBNEJM() {
                return this.unk2700LPEKFJBNEJM_;
            }
            
            public Builder setUnk2700LPEKFJBNEJM(final int value) {
                this.unk2700LPEKFJBNEJM_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearUnk2700LPEKFJBNEJM() {
                this.unk2700LPEKFJBNEJM_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }
            
            @Override
            public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }
        }
    }
    
    public interface MusicBriefInfoOrBuilder extends MessageOrBuilder
    {
        long getMusicShareId();
        
        int getMusicId();
        
        String getAuthorNickname();
        
        ByteString getAuthorNicknameBytes();
        
        int getMusicNoteCount();
        
        int getMaxScore();
        
        int getScore();
        
        int getCreateTime();
        
        int getShareTime();
        
        int getPosition();
        
        boolean getSettle();
        
        int getVersion();
        
        boolean getCanShare();
        
        boolean getUnk2700DNLEGADDHKM();
        
        boolean getUnk2700GBCGGDONMCD();
        
        long getUnk2700JNENCBCGPGO();
        
        int getUnk2700MKBNLEKMIMD();
        
        List<Integer> getUnk2700JAEONBMBFJJList();
        
        int getUnk2700JAEONBMBFJJCount();
        
        int getUnk2700JAEONBMBFJJ(final int p0);
        
        List<Integer> getUnk2700GDCGOMNBMEOList();
        
        int getUnk2700GDCGOMNBMEOCount();
        
        int getUnk2700GDCGOMNBMEO(final int p0);
        
        int getUnk2700KAMOCHAKPGP();
        
        int getUnk2700LPEKFJBNEJM();
    }
}
