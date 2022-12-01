// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import java.util.Collections;
import java.util.Collection;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.Message;
import java.io.InputStream;
import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
import com.google.protobuf.CodedOutputStream;
import java.util.List;
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

public final class MusicGameSettleReqOuterClass
{
    private static final Descriptors.Descriptor internal_static_MusicGameSettleReq_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_MusicGameSettleReq_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private MusicGameSettleReqOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return MusicGameSettleReqOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0018MusicGameSettleReq.proto\"\u00e4\u0003\n\u0012MusicGameSettleReq\u0012\u001c\n\u0013Unk2700_GDPKOANEDEB\u0018\u0080\u0003 \u0003(\r\u0012\u001c\n\u0013Unk2700_NMHGADLANMM\u0018\u009b\u0006 \u0001(\r\u0012\u001b\n\u0013Unk2700_NNHGOCJLKFH\u0018\u0004 \u0003(\r\u0012\u001b\n\u0013Unk2700_NCHHEJNFECG\u0018\u000f \u0001(\r\u0012\r\n\u0005score\u0018\t \u0001(\r\u0012\u001b\n\u0013Unk2700_CEPGMKAHHCD\u0018\u0006 \u0001(\u0004\u0012\u001b\n\u0013Unk2700_MMHHGALFHGA\u0018\r \u0001(\r\u0012\u001c\n\u0013Unk2700_CBLIJHDFKHA\u0018¦\u0003 \u0001(\b\u0012\u0011\n\tmax_combo\u0018\u0005 \u0001(\r\u0012\u001c\n\u0013Unk2700_FBLBGPHMLAL\u0018¢\b \u0001(\r\u0012\u000e\n\u0005speed\u0018\u0099\u0003 \u0001(\u0002\u0012\u001b\n\u0013Unk2700_IOKPIKJDEHG\u0018\u0003 \u0001(\b\u0012\r\n\u0005combo\u0018\u0001 \u0001(\r\u0012\u0016\n\u000emusic_basic_id\u0018\u0007 \u0001(\r\u0012\u001b\n\u0013Unk2700_DIMBABOGNEM\u0018\u0002 \u0001(\r\u0012\u001c\n\u0013Unk2700_IOMOHEKJJLJ\u0018¡\u000f \u0001(\r\u0012\u0013\n\u000bcorrect_hit\u0018\u000e \u0001(\r\u0012\u001c\n\u0013Unk2700_LKJNLDJAGGL\u0018\u0085\n \u0001(\bB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        MusicGameSettleReqOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_MusicGameSettleReq_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_MusicGameSettleReq_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(MusicGameSettleReqOuterClass.internal_static_MusicGameSettleReq_descriptor, new String[] { "Unk2700GDPKOANEDEB", "Unk2700NMHGADLANMM", "Unk2700NNHGOCJLKFH", "Unk2700NCHHEJNFECG", "Score", "Unk2700CEPGMKAHHCD", "Unk2700MMHHGALFHGA", "Unk2700CBLIJHDFKHA", "MaxCombo", "Unk2700FBLBGPHMLAL", "Speed", "Unk2700IOKPIKJDEHG", "Combo", "MusicBasicId", "Unk2700DIMBABOGNEM", "Unk2700IOMOHEKJJLJ", "CorrectHit", "Unk2700LKJNLDJAGGL" });
    }
    
    public static final class MusicGameSettleReq extends GeneratedMessageV3 implements MusicGameSettleReqOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int UNK2700_GDPKOANEDEB_FIELD_NUMBER = 384;
        private Internal.IntList unk2700GDPKOANEDEB_;
        private int unk2700GDPKOANEDEBMemoizedSerializedSize;
        public static final int UNK2700_NMHGADLANMM_FIELD_NUMBER = 795;
        private int unk2700NMHGADLANMM_;
        public static final int UNK2700_NNHGOCJLKFH_FIELD_NUMBER = 4;
        private Internal.IntList unk2700NNHGOCJLKFH_;
        private int unk2700NNHGOCJLKFHMemoizedSerializedSize;
        public static final int UNK2700_NCHHEJNFECG_FIELD_NUMBER = 15;
        private int unk2700NCHHEJNFECG_;
        public static final int SCORE_FIELD_NUMBER = 9;
        private int score_;
        public static final int UNK2700_CEPGMKAHHCD_FIELD_NUMBER = 6;
        private long unk2700CEPGMKAHHCD_;
        public static final int UNK2700_MMHHGALFHGA_FIELD_NUMBER = 13;
        private int unk2700MMHHGALFHGA_;
        public static final int UNK2700_CBLIJHDFKHA_FIELD_NUMBER = 422;
        private boolean unk2700CBLIJHDFKHA_;
        public static final int MAX_COMBO_FIELD_NUMBER = 5;
        private int maxCombo_;
        public static final int UNK2700_FBLBGPHMLAL_FIELD_NUMBER = 1058;
        private int unk2700FBLBGPHMLAL_;
        public static final int SPEED_FIELD_NUMBER = 409;
        private float speed_;
        public static final int UNK2700_IOKPIKJDEHG_FIELD_NUMBER = 3;
        private boolean unk2700IOKPIKJDEHG_;
        public static final int COMBO_FIELD_NUMBER = 1;
        private int combo_;
        public static final int MUSIC_BASIC_ID_FIELD_NUMBER = 7;
        private int musicBasicId_;
        public static final int UNK2700_DIMBABOGNEM_FIELD_NUMBER = 2;
        private int unk2700DIMBABOGNEM_;
        public static final int UNK2700_IOMOHEKJJLJ_FIELD_NUMBER = 1953;
        private int unk2700IOMOHEKJJLJ_;
        public static final int CORRECT_HIT_FIELD_NUMBER = 14;
        private int correctHit_;
        public static final int UNK2700_LKJNLDJAGGL_FIELD_NUMBER = 1285;
        private boolean unk2700LKJNLDJAGGL_;
        private byte memoizedIsInitialized;
        private static final MusicGameSettleReq DEFAULT_INSTANCE;
        private static final Parser<MusicGameSettleReq> PARSER;
        
        private MusicGameSettleReq(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.unk2700GDPKOANEDEBMemoizedSerializedSize = -1;
            this.unk2700NNHGOCJLKFHMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
        }
        
        private MusicGameSettleReq() {
            this.unk2700GDPKOANEDEBMemoizedSerializedSize = -1;
            this.unk2700NNHGOCJLKFHMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.unk2700GDPKOANEDEB_ = GeneratedMessageV3.emptyIntList();
            this.unk2700NNHGOCJLKFH_ = GeneratedMessageV3.emptyIntList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new MusicGameSettleReq();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private MusicGameSettleReq(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.combo_ = input.readUInt32();
                            continue;
                        }
                        case 16: {
                            this.unk2700DIMBABOGNEM_ = input.readUInt32();
                            continue;
                        }
                        case 24: {
                            this.unk2700IOKPIKJDEHG_ = input.readBool();
                            continue;
                        }
                        case 32: {
                            if ((mutable_bitField0_ & 0x2) == 0x0) {
                                this.unk2700NNHGOCJLKFH_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x2;
                            }
                            this.unk2700NNHGOCJLKFH_.addInt(input.readUInt32());
                            continue;
                        }
                        case 34: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x2) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.unk2700NNHGOCJLKFH_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x2;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.unk2700NNHGOCJLKFH_.addInt(input.readUInt32());
                            }
                            input.popLimit(limit);
                            continue;
                        }
                        case 40: {
                            this.maxCombo_ = input.readUInt32();
                            continue;
                        }
                        case 48: {
                            this.unk2700CEPGMKAHHCD_ = input.readUInt64();
                            continue;
                        }
                        case 56: {
                            this.musicBasicId_ = input.readUInt32();
                            continue;
                        }
                        case 72: {
                            this.score_ = input.readUInt32();
                            continue;
                        }
                        case 104: {
                            this.unk2700MMHHGALFHGA_ = input.readUInt32();
                            continue;
                        }
                        case 112: {
                            this.correctHit_ = input.readUInt32();
                            continue;
                        }
                        case 120: {
                            this.unk2700NCHHEJNFECG_ = input.readUInt32();
                            continue;
                        }
                        case 3072: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.unk2700GDPKOANEDEB_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.unk2700GDPKOANEDEB_.addInt(input.readUInt32());
                            continue;
                        }
                        case 3074: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x1) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.unk2700GDPKOANEDEB_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.unk2700GDPKOANEDEB_.addInt(input.readUInt32());
                            }
                            input.popLimit(limit);
                            continue;
                        }
                        case 3277: {
                            this.speed_ = input.readFloat();
                            continue;
                        }
                        case 3376: {
                            this.unk2700CBLIJHDFKHA_ = input.readBool();
                            continue;
                        }
                        case 6360: {
                            this.unk2700NMHGADLANMM_ = input.readUInt32();
                            continue;
                        }
                        case 8464: {
                            this.unk2700FBLBGPHMLAL_ = input.readUInt32();
                            continue;
                        }
                        case 10280: {
                            this.unk2700LKJNLDJAGGL_ = input.readBool();
                            continue;
                        }
                        case 15624: {
                            this.unk2700IOMOHEKJJLJ_ = input.readUInt32();
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
                if ((mutable_bitField0_ & 0x2) != 0x0) {
                    this.unk2700NNHGOCJLKFH_.makeImmutable();
                }
                if ((mutable_bitField0_ & 0x1) != 0x0) {
                    this.unk2700GDPKOANEDEB_.makeImmutable();
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return MusicGameSettleReqOuterClass.internal_static_MusicGameSettleReq_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return MusicGameSettleReqOuterClass.internal_static_MusicGameSettleReq_fieldAccessorTable.ensureFieldAccessorsInitialized(MusicGameSettleReq.class, Builder.class);
        }
        
        @Override
        public List<Integer> getUnk2700GDPKOANEDEBList() {
            return this.unk2700GDPKOANEDEB_;
        }
        
        @Override
        public int getUnk2700GDPKOANEDEBCount() {
            return this.unk2700GDPKOANEDEB_.size();
        }
        
        @Override
        public int getUnk2700GDPKOANEDEB(final int index) {
            return this.unk2700GDPKOANEDEB_.getInt(index);
        }
        
        @Override
        public int getUnk2700NMHGADLANMM() {
            return this.unk2700NMHGADLANMM_;
        }
        
        @Override
        public List<Integer> getUnk2700NNHGOCJLKFHList() {
            return this.unk2700NNHGOCJLKFH_;
        }
        
        @Override
        public int getUnk2700NNHGOCJLKFHCount() {
            return this.unk2700NNHGOCJLKFH_.size();
        }
        
        @Override
        public int getUnk2700NNHGOCJLKFH(final int index) {
            return this.unk2700NNHGOCJLKFH_.getInt(index);
        }
        
        @Override
        public int getUnk2700NCHHEJNFECG() {
            return this.unk2700NCHHEJNFECG_;
        }
        
        @Override
        public int getScore() {
            return this.score_;
        }
        
        @Override
        public long getUnk2700CEPGMKAHHCD() {
            return this.unk2700CEPGMKAHHCD_;
        }
        
        @Override
        public int getUnk2700MMHHGALFHGA() {
            return this.unk2700MMHHGALFHGA_;
        }
        
        @Override
        public boolean getUnk2700CBLIJHDFKHA() {
            return this.unk2700CBLIJHDFKHA_;
        }
        
        @Override
        public int getMaxCombo() {
            return this.maxCombo_;
        }
        
        @Override
        public int getUnk2700FBLBGPHMLAL() {
            return this.unk2700FBLBGPHMLAL_;
        }
        
        @Override
        public float getSpeed() {
            return this.speed_;
        }
        
        @Override
        public boolean getUnk2700IOKPIKJDEHG() {
            return this.unk2700IOKPIKJDEHG_;
        }
        
        @Override
        public int getCombo() {
            return this.combo_;
        }
        
        @Override
        public int getMusicBasicId() {
            return this.musicBasicId_;
        }
        
        @Override
        public int getUnk2700DIMBABOGNEM() {
            return this.unk2700DIMBABOGNEM_;
        }
        
        @Override
        public int getUnk2700IOMOHEKJJLJ() {
            return this.unk2700IOMOHEKJJLJ_;
        }
        
        @Override
        public int getCorrectHit() {
            return this.correctHit_;
        }
        
        @Override
        public boolean getUnk2700LKJNLDJAGGL() {
            return this.unk2700LKJNLDJAGGL_;
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
            if (this.combo_ != 0) {
                output.writeUInt32(1, this.combo_);
            }
            if (this.unk2700DIMBABOGNEM_ != 0) {
                output.writeUInt32(2, this.unk2700DIMBABOGNEM_);
            }
            if (this.unk2700IOKPIKJDEHG_) {
                output.writeBool(3, this.unk2700IOKPIKJDEHG_);
            }
            if (this.getUnk2700NNHGOCJLKFHList().size() > 0) {
                output.writeUInt32NoTag(34);
                output.writeUInt32NoTag(this.unk2700NNHGOCJLKFHMemoizedSerializedSize);
            }
            for (int i = 0; i < this.unk2700NNHGOCJLKFH_.size(); ++i) {
                output.writeUInt32NoTag(this.unk2700NNHGOCJLKFH_.getInt(i));
            }
            if (this.maxCombo_ != 0) {
                output.writeUInt32(5, this.maxCombo_);
            }
            if (this.unk2700CEPGMKAHHCD_ != 0L) {
                output.writeUInt64(6, this.unk2700CEPGMKAHHCD_);
            }
            if (this.musicBasicId_ != 0) {
                output.writeUInt32(7, this.musicBasicId_);
            }
            if (this.score_ != 0) {
                output.writeUInt32(9, this.score_);
            }
            if (this.unk2700MMHHGALFHGA_ != 0) {
                output.writeUInt32(13, this.unk2700MMHHGALFHGA_);
            }
            if (this.correctHit_ != 0) {
                output.writeUInt32(14, this.correctHit_);
            }
            if (this.unk2700NCHHEJNFECG_ != 0) {
                output.writeUInt32(15, this.unk2700NCHHEJNFECG_);
            }
            if (this.getUnk2700GDPKOANEDEBList().size() > 0) {
                output.writeUInt32NoTag(3074);
                output.writeUInt32NoTag(this.unk2700GDPKOANEDEBMemoizedSerializedSize);
            }
            for (int i = 0; i < this.unk2700GDPKOANEDEB_.size(); ++i) {
                output.writeUInt32NoTag(this.unk2700GDPKOANEDEB_.getInt(i));
            }
            if (this.speed_ != 0.0f) {
                output.writeFloat(409, this.speed_);
            }
            if (this.unk2700CBLIJHDFKHA_) {
                output.writeBool(422, this.unk2700CBLIJHDFKHA_);
            }
            if (this.unk2700NMHGADLANMM_ != 0) {
                output.writeUInt32(795, this.unk2700NMHGADLANMM_);
            }
            if (this.unk2700FBLBGPHMLAL_ != 0) {
                output.writeUInt32(1058, this.unk2700FBLBGPHMLAL_);
            }
            if (this.unk2700LKJNLDJAGGL_) {
                output.writeBool(1285, this.unk2700LKJNLDJAGGL_);
            }
            if (this.unk2700IOMOHEKJJLJ_ != 0) {
                output.writeUInt32(1953, this.unk2700IOMOHEKJJLJ_);
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
            if (this.combo_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1, this.combo_);
            }
            if (this.unk2700DIMBABOGNEM_ != 0) {
                size += CodedOutputStream.computeUInt32Size(2, this.unk2700DIMBABOGNEM_);
            }
            if (this.unk2700IOKPIKJDEHG_) {
                size += CodedOutputStream.computeBoolSize(3, this.unk2700IOKPIKJDEHG_);
            }
            int dataSize = 0;
            for (int i = 0; i < this.unk2700NNHGOCJLKFH_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.unk2700NNHGOCJLKFH_.getInt(i));
            }
            size += dataSize;
            if (!this.getUnk2700NNHGOCJLKFHList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.unk2700NNHGOCJLKFHMemoizedSerializedSize = dataSize;
            if (this.maxCombo_ != 0) {
                size += CodedOutputStream.computeUInt32Size(5, this.maxCombo_);
            }
            if (this.unk2700CEPGMKAHHCD_ != 0L) {
                size += CodedOutputStream.computeUInt64Size(6, this.unk2700CEPGMKAHHCD_);
            }
            if (this.musicBasicId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(7, this.musicBasicId_);
            }
            if (this.score_ != 0) {
                size += CodedOutputStream.computeUInt32Size(9, this.score_);
            }
            if (this.unk2700MMHHGALFHGA_ != 0) {
                size += CodedOutputStream.computeUInt32Size(13, this.unk2700MMHHGALFHGA_);
            }
            if (this.correctHit_ != 0) {
                size += CodedOutputStream.computeUInt32Size(14, this.correctHit_);
            }
            if (this.unk2700NCHHEJNFECG_ != 0) {
                size += CodedOutputStream.computeUInt32Size(15, this.unk2700NCHHEJNFECG_);
            }
            dataSize = 0;
            for (int i = 0; i < this.unk2700GDPKOANEDEB_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.unk2700GDPKOANEDEB_.getInt(i));
            }
            size += dataSize;
            if (!this.getUnk2700GDPKOANEDEBList().isEmpty()) {
                size += 2;
                size += CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.unk2700GDPKOANEDEBMemoizedSerializedSize = dataSize;
            if (this.speed_ != 0.0f) {
                size += CodedOutputStream.computeFloatSize(409, this.speed_);
            }
            if (this.unk2700CBLIJHDFKHA_) {
                size += CodedOutputStream.computeBoolSize(422, this.unk2700CBLIJHDFKHA_);
            }
            if (this.unk2700NMHGADLANMM_ != 0) {
                size += CodedOutputStream.computeUInt32Size(795, this.unk2700NMHGADLANMM_);
            }
            if (this.unk2700FBLBGPHMLAL_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1058, this.unk2700FBLBGPHMLAL_);
            }
            if (this.unk2700LKJNLDJAGGL_) {
                size += CodedOutputStream.computeBoolSize(1285, this.unk2700LKJNLDJAGGL_);
            }
            if (this.unk2700IOMOHEKJJLJ_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1953, this.unk2700IOMOHEKJJLJ_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MusicGameSettleReq)) {
                return super.equals(obj);
            }
            final MusicGameSettleReq other = (MusicGameSettleReq)obj;
            return this.getUnk2700GDPKOANEDEBList().equals(other.getUnk2700GDPKOANEDEBList()) && this.getUnk2700NMHGADLANMM() == other.getUnk2700NMHGADLANMM() && this.getUnk2700NNHGOCJLKFHList().equals(other.getUnk2700NNHGOCJLKFHList()) && this.getUnk2700NCHHEJNFECG() == other.getUnk2700NCHHEJNFECG() && this.getScore() == other.getScore() && this.getUnk2700CEPGMKAHHCD() == other.getUnk2700CEPGMKAHHCD() && this.getUnk2700MMHHGALFHGA() == other.getUnk2700MMHHGALFHGA() && this.getUnk2700CBLIJHDFKHA() == other.getUnk2700CBLIJHDFKHA() && this.getMaxCombo() == other.getMaxCombo() && this.getUnk2700FBLBGPHMLAL() == other.getUnk2700FBLBGPHMLAL() && Float.floatToIntBits(this.getSpeed()) == Float.floatToIntBits(other.getSpeed()) && this.getUnk2700IOKPIKJDEHG() == other.getUnk2700IOKPIKJDEHG() && this.getCombo() == other.getCombo() && this.getMusicBasicId() == other.getMusicBasicId() && this.getUnk2700DIMBABOGNEM() == other.getUnk2700DIMBABOGNEM() && this.getUnk2700IOMOHEKJJLJ() == other.getUnk2700IOMOHEKJJLJ() && this.getCorrectHit() == other.getCorrectHit() && this.getUnk2700LKJNLDJAGGL() == other.getUnk2700LKJNLDJAGGL() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getUnk2700GDPKOANEDEBCount() > 0) {
                hash = 37 * hash + 384;
                hash = 53 * hash + this.getUnk2700GDPKOANEDEBList().hashCode();
            }
            hash = 37 * hash + 795;
            hash = 53 * hash + this.getUnk2700NMHGADLANMM();
            if (this.getUnk2700NNHGOCJLKFHCount() > 0) {
                hash = 37 * hash + 4;
                hash = 53 * hash + this.getUnk2700NNHGOCJLKFHList().hashCode();
            }
            hash = 37 * hash + 15;
            hash = 53 * hash + this.getUnk2700NCHHEJNFECG();
            hash = 37 * hash + 9;
            hash = 53 * hash + this.getScore();
            hash = 37 * hash + 6;
            hash = 53 * hash + Internal.hashLong(this.getUnk2700CEPGMKAHHCD());
            hash = 37 * hash + 13;
            hash = 53 * hash + this.getUnk2700MMHHGALFHGA();
            hash = 37 * hash + 422;
            hash = 53 * hash + Internal.hashBoolean(this.getUnk2700CBLIJHDFKHA());
            hash = 37 * hash + 5;
            hash = 53 * hash + this.getMaxCombo();
            hash = 37 * hash + 1058;
            hash = 53 * hash + this.getUnk2700FBLBGPHMLAL();
            hash = 37 * hash + 409;
            hash = 53 * hash + Float.floatToIntBits(this.getSpeed());
            hash = 37 * hash + 3;
            hash = 53 * hash + Internal.hashBoolean(this.getUnk2700IOKPIKJDEHG());
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getCombo();
            hash = 37 * hash + 7;
            hash = 53 * hash + this.getMusicBasicId();
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getUnk2700DIMBABOGNEM();
            hash = 37 * hash + 1953;
            hash = 53 * hash + this.getUnk2700IOMOHEKJJLJ();
            hash = 37 * hash + 14;
            hash = 53 * hash + this.getCorrectHit();
            hash = 37 * hash + 1285;
            hash = 53 * hash + Internal.hashBoolean(this.getUnk2700LKJNLDJAGGL());
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static MusicGameSettleReq parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return MusicGameSettleReq.PARSER.parseFrom(data);
        }
        
        public static MusicGameSettleReq parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return MusicGameSettleReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static MusicGameSettleReq parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return MusicGameSettleReq.PARSER.parseFrom(data);
        }
        
        public static MusicGameSettleReq parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return MusicGameSettleReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static MusicGameSettleReq parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return MusicGameSettleReq.PARSER.parseFrom(data);
        }
        
        public static MusicGameSettleReq parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return MusicGameSettleReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static MusicGameSettleReq parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MusicGameSettleReq.PARSER, input);
        }
        
        public static MusicGameSettleReq parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MusicGameSettleReq.PARSER, input, extensionRegistry);
        }
        
        public static MusicGameSettleReq parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(MusicGameSettleReq.PARSER, input);
        }
        
        public static MusicGameSettleReq parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(MusicGameSettleReq.PARSER, input, extensionRegistry);
        }
        
        public static MusicGameSettleReq parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MusicGameSettleReq.PARSER, input);
        }
        
        public static MusicGameSettleReq parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MusicGameSettleReq.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return MusicGameSettleReq.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final MusicGameSettleReq prototype) {
            return MusicGameSettleReq.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == MusicGameSettleReq.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static MusicGameSettleReq getDefaultInstance() {
            return MusicGameSettleReq.DEFAULT_INSTANCE;
        }
        
        public static Parser<MusicGameSettleReq> parser() {
            return MusicGameSettleReq.PARSER;
        }
        
        @Override
        public Parser<MusicGameSettleReq> getParserForType() {
            return MusicGameSettleReq.PARSER;
        }
        
        @Override
        public MusicGameSettleReq getDefaultInstanceForType() {
            return MusicGameSettleReq.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new MusicGameSettleReq();
            PARSER = new AbstractParser<MusicGameSettleReq>() {
                @Override
                public MusicGameSettleReq parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new MusicGameSettleReq(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements MusicGameSettleReqOrBuilder
        {
            private int bitField0_;
            private Internal.IntList unk2700GDPKOANEDEB_;
            private int unk2700NMHGADLANMM_;
            private Internal.IntList unk2700NNHGOCJLKFH_;
            private int unk2700NCHHEJNFECG_;
            private int score_;
            private long unk2700CEPGMKAHHCD_;
            private int unk2700MMHHGALFHGA_;
            private boolean unk2700CBLIJHDFKHA_;
            private int maxCombo_;
            private int unk2700FBLBGPHMLAL_;
            private float speed_;
            private boolean unk2700IOKPIKJDEHG_;
            private int combo_;
            private int musicBasicId_;
            private int unk2700DIMBABOGNEM_;
            private int unk2700IOMOHEKJJLJ_;
            private int correctHit_;
            private boolean unk2700LKJNLDJAGGL_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return MusicGameSettleReqOuterClass.internal_static_MusicGameSettleReq_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return MusicGameSettleReqOuterClass.internal_static_MusicGameSettleReq_fieldAccessorTable.ensureFieldAccessorsInitialized(MusicGameSettleReq.class, Builder.class);
            }
            
            private Builder() {
                this.unk2700GDPKOANEDEB_ = GeneratedMessageV3.emptyIntList();
                this.unk2700NNHGOCJLKFH_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.unk2700GDPKOANEDEB_ = GeneratedMessageV3.emptyIntList();
                this.unk2700NNHGOCJLKFH_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (MusicGameSettleReq.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.unk2700GDPKOANEDEB_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                this.unk2700NMHGADLANMM_ = 0;
                this.unk2700NNHGOCJLKFH_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFD;
                this.unk2700NCHHEJNFECG_ = 0;
                this.score_ = 0;
                this.unk2700CEPGMKAHHCD_ = 0L;
                this.unk2700MMHHGALFHGA_ = 0;
                this.unk2700CBLIJHDFKHA_ = false;
                this.maxCombo_ = 0;
                this.unk2700FBLBGPHMLAL_ = 0;
                this.speed_ = 0.0f;
                this.unk2700IOKPIKJDEHG_ = false;
                this.combo_ = 0;
                this.musicBasicId_ = 0;
                this.unk2700DIMBABOGNEM_ = 0;
                this.unk2700IOMOHEKJJLJ_ = 0;
                this.correctHit_ = 0;
                this.unk2700LKJNLDJAGGL_ = false;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return MusicGameSettleReqOuterClass.internal_static_MusicGameSettleReq_descriptor;
            }
            
            @Override
            public MusicGameSettleReq getDefaultInstanceForType() {
                return MusicGameSettleReq.getDefaultInstance();
            }
            
            @Override
            public MusicGameSettleReq build() {
                final MusicGameSettleReq result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public MusicGameSettleReq buildPartial() {
                final MusicGameSettleReq result = new MusicGameSettleReq(this);
                final int from_bitField0_ = this.bitField0_;
                if ((this.bitField0_ & 0x1) != 0x0) {
                    this.unk2700GDPKOANEDEB_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                result.unk2700GDPKOANEDEB_ = this.unk2700GDPKOANEDEB_;
                result.unk2700NMHGADLANMM_ = this.unk2700NMHGADLANMM_;
                if ((this.bitField0_ & 0x2) != 0x0) {
                    this.unk2700NNHGOCJLKFH_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFD;
                }
                result.unk2700NNHGOCJLKFH_ = this.unk2700NNHGOCJLKFH_;
                result.unk2700NCHHEJNFECG_ = this.unk2700NCHHEJNFECG_;
                result.score_ = this.score_;
                result.unk2700CEPGMKAHHCD_ = this.unk2700CEPGMKAHHCD_;
                result.unk2700MMHHGALFHGA_ = this.unk2700MMHHGALFHGA_;
                result.unk2700CBLIJHDFKHA_ = this.unk2700CBLIJHDFKHA_;
                result.maxCombo_ = this.maxCombo_;
                result.unk2700FBLBGPHMLAL_ = this.unk2700FBLBGPHMLAL_;
                result.speed_ = this.speed_;
                result.unk2700IOKPIKJDEHG_ = this.unk2700IOKPIKJDEHG_;
                result.combo_ = this.combo_;
                result.musicBasicId_ = this.musicBasicId_;
                result.unk2700DIMBABOGNEM_ = this.unk2700DIMBABOGNEM_;
                result.unk2700IOMOHEKJJLJ_ = this.unk2700IOMOHEKJJLJ_;
                result.correctHit_ = this.correctHit_;
                result.unk2700LKJNLDJAGGL_ = this.unk2700LKJNLDJAGGL_;
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
                if (other instanceof MusicGameSettleReq) {
                    return this.mergeFrom((MusicGameSettleReq)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final MusicGameSettleReq other) {
                if (other == MusicGameSettleReq.getDefaultInstance()) {
                    return this;
                }
                if (!other.unk2700GDPKOANEDEB_.isEmpty()) {
                    if (this.unk2700GDPKOANEDEB_.isEmpty()) {
                        this.unk2700GDPKOANEDEB_ = other.unk2700GDPKOANEDEB_;
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    else {
                        this.ensureUnk2700GDPKOANEDEBIsMutable();
                        this.unk2700GDPKOANEDEB_.addAll(other.unk2700GDPKOANEDEB_);
                    }
                    this.onChanged();
                }
                if (other.getUnk2700NMHGADLANMM() != 0) {
                    this.setUnk2700NMHGADLANMM(other.getUnk2700NMHGADLANMM());
                }
                if (!other.unk2700NNHGOCJLKFH_.isEmpty()) {
                    if (this.unk2700NNHGOCJLKFH_.isEmpty()) {
                        this.unk2700NNHGOCJLKFH_ = other.unk2700NNHGOCJLKFH_;
                        this.bitField0_ &= 0xFFFFFFFD;
                    }
                    else {
                        this.ensureUnk2700NNHGOCJLKFHIsMutable();
                        this.unk2700NNHGOCJLKFH_.addAll(other.unk2700NNHGOCJLKFH_);
                    }
                    this.onChanged();
                }
                if (other.getUnk2700NCHHEJNFECG() != 0) {
                    this.setUnk2700NCHHEJNFECG(other.getUnk2700NCHHEJNFECG());
                }
                if (other.getScore() != 0) {
                    this.setScore(other.getScore());
                }
                if (other.getUnk2700CEPGMKAHHCD() != 0L) {
                    this.setUnk2700CEPGMKAHHCD(other.getUnk2700CEPGMKAHHCD());
                }
                if (other.getUnk2700MMHHGALFHGA() != 0) {
                    this.setUnk2700MMHHGALFHGA(other.getUnk2700MMHHGALFHGA());
                }
                if (other.getUnk2700CBLIJHDFKHA()) {
                    this.setUnk2700CBLIJHDFKHA(other.getUnk2700CBLIJHDFKHA());
                }
                if (other.getMaxCombo() != 0) {
                    this.setMaxCombo(other.getMaxCombo());
                }
                if (other.getUnk2700FBLBGPHMLAL() != 0) {
                    this.setUnk2700FBLBGPHMLAL(other.getUnk2700FBLBGPHMLAL());
                }
                if (other.getSpeed() != 0.0f) {
                    this.setSpeed(other.getSpeed());
                }
                if (other.getUnk2700IOKPIKJDEHG()) {
                    this.setUnk2700IOKPIKJDEHG(other.getUnk2700IOKPIKJDEHG());
                }
                if (other.getCombo() != 0) {
                    this.setCombo(other.getCombo());
                }
                if (other.getMusicBasicId() != 0) {
                    this.setMusicBasicId(other.getMusicBasicId());
                }
                if (other.getUnk2700DIMBABOGNEM() != 0) {
                    this.setUnk2700DIMBABOGNEM(other.getUnk2700DIMBABOGNEM());
                }
                if (other.getUnk2700IOMOHEKJJLJ() != 0) {
                    this.setUnk2700IOMOHEKJJLJ(other.getUnk2700IOMOHEKJJLJ());
                }
                if (other.getCorrectHit() != 0) {
                    this.setCorrectHit(other.getCorrectHit());
                }
                if (other.getUnk2700LKJNLDJAGGL()) {
                    this.setUnk2700LKJNLDJAGGL(other.getUnk2700LKJNLDJAGGL());
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
                MusicGameSettleReq parsedMessage = null;
                try {
                    parsedMessage = MusicGameSettleReq.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (MusicGameSettleReq)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            private void ensureUnk2700GDPKOANEDEBIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.unk2700GDPKOANEDEB_ = GeneratedMessageV3.mutableCopy(this.unk2700GDPKOANEDEB_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<Integer> getUnk2700GDPKOANEDEBList() {
                return ((this.bitField0_ & 0x1) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.unk2700GDPKOANEDEB_) : this.unk2700GDPKOANEDEB_;
            }
            
            @Override
            public int getUnk2700GDPKOANEDEBCount() {
                return this.unk2700GDPKOANEDEB_.size();
            }
            
            @Override
            public int getUnk2700GDPKOANEDEB(final int index) {
                return this.unk2700GDPKOANEDEB_.getInt(index);
            }
            
            public Builder setUnk2700GDPKOANEDEB(final int index, final int value) {
                this.ensureUnk2700GDPKOANEDEBIsMutable();
                this.unk2700GDPKOANEDEB_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addUnk2700GDPKOANEDEB(final int value) {
                this.ensureUnk2700GDPKOANEDEBIsMutable();
                this.unk2700GDPKOANEDEB_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllUnk2700GDPKOANEDEB(final Iterable<? extends Integer> values) {
                this.ensureUnk2700GDPKOANEDEBIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.unk2700GDPKOANEDEB_);
                this.onChanged();
                return this;
            }
            
            public Builder clearUnk2700GDPKOANEDEB() {
                this.unk2700GDPKOANEDEB_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getUnk2700NMHGADLANMM() {
                return this.unk2700NMHGADLANMM_;
            }
            
            public Builder setUnk2700NMHGADLANMM(final int value) {
                this.unk2700NMHGADLANMM_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearUnk2700NMHGADLANMM() {
                this.unk2700NMHGADLANMM_ = 0;
                this.onChanged();
                return this;
            }
            
            private void ensureUnk2700NNHGOCJLKFHIsMutable() {
                if ((this.bitField0_ & 0x2) == 0x0) {
                    this.unk2700NNHGOCJLKFH_ = GeneratedMessageV3.mutableCopy(this.unk2700NNHGOCJLKFH_);
                    this.bitField0_ |= 0x2;
                }
            }
            
            @Override
            public List<Integer> getUnk2700NNHGOCJLKFHList() {
                return ((this.bitField0_ & 0x2) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.unk2700NNHGOCJLKFH_) : this.unk2700NNHGOCJLKFH_;
            }
            
            @Override
            public int getUnk2700NNHGOCJLKFHCount() {
                return this.unk2700NNHGOCJLKFH_.size();
            }
            
            @Override
            public int getUnk2700NNHGOCJLKFH(final int index) {
                return this.unk2700NNHGOCJLKFH_.getInt(index);
            }
            
            public Builder setUnk2700NNHGOCJLKFH(final int index, final int value) {
                this.ensureUnk2700NNHGOCJLKFHIsMutable();
                this.unk2700NNHGOCJLKFH_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addUnk2700NNHGOCJLKFH(final int value) {
                this.ensureUnk2700NNHGOCJLKFHIsMutable();
                this.unk2700NNHGOCJLKFH_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllUnk2700NNHGOCJLKFH(final Iterable<? extends Integer> values) {
                this.ensureUnk2700NNHGOCJLKFHIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.unk2700NNHGOCJLKFH_);
                this.onChanged();
                return this;
            }
            
            public Builder clearUnk2700NNHGOCJLKFH() {
                this.unk2700NNHGOCJLKFH_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFD;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getUnk2700NCHHEJNFECG() {
                return this.unk2700NCHHEJNFECG_;
            }
            
            public Builder setUnk2700NCHHEJNFECG(final int value) {
                this.unk2700NCHHEJNFECG_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearUnk2700NCHHEJNFECG() {
                this.unk2700NCHHEJNFECG_ = 0;
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
            public long getUnk2700CEPGMKAHHCD() {
                return this.unk2700CEPGMKAHHCD_;
            }
            
            public Builder setUnk2700CEPGMKAHHCD(final long value) {
                this.unk2700CEPGMKAHHCD_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearUnk2700CEPGMKAHHCD() {
                this.unk2700CEPGMKAHHCD_ = 0L;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getUnk2700MMHHGALFHGA() {
                return this.unk2700MMHHGALFHGA_;
            }
            
            public Builder setUnk2700MMHHGALFHGA(final int value) {
                this.unk2700MMHHGALFHGA_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearUnk2700MMHHGALFHGA() {
                this.unk2700MMHHGALFHGA_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean getUnk2700CBLIJHDFKHA() {
                return this.unk2700CBLIJHDFKHA_;
            }
            
            public Builder setUnk2700CBLIJHDFKHA(final boolean value) {
                this.unk2700CBLIJHDFKHA_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearUnk2700CBLIJHDFKHA() {
                this.unk2700CBLIJHDFKHA_ = false;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getMaxCombo() {
                return this.maxCombo_;
            }
            
            public Builder setMaxCombo(final int value) {
                this.maxCombo_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearMaxCombo() {
                this.maxCombo_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getUnk2700FBLBGPHMLAL() {
                return this.unk2700FBLBGPHMLAL_;
            }
            
            public Builder setUnk2700FBLBGPHMLAL(final int value) {
                this.unk2700FBLBGPHMLAL_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearUnk2700FBLBGPHMLAL() {
                this.unk2700FBLBGPHMLAL_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public float getSpeed() {
                return this.speed_;
            }
            
            public Builder setSpeed(final float value) {
                this.speed_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearSpeed() {
                this.speed_ = 0.0f;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean getUnk2700IOKPIKJDEHG() {
                return this.unk2700IOKPIKJDEHG_;
            }
            
            public Builder setUnk2700IOKPIKJDEHG(final boolean value) {
                this.unk2700IOKPIKJDEHG_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearUnk2700IOKPIKJDEHG() {
                this.unk2700IOKPIKJDEHG_ = false;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getCombo() {
                return this.combo_;
            }
            
            public Builder setCombo(final int value) {
                this.combo_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearCombo() {
                this.combo_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getMusicBasicId() {
                return this.musicBasicId_;
            }
            
            public Builder setMusicBasicId(final int value) {
                this.musicBasicId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearMusicBasicId() {
                this.musicBasicId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getUnk2700DIMBABOGNEM() {
                return this.unk2700DIMBABOGNEM_;
            }
            
            public Builder setUnk2700DIMBABOGNEM(final int value) {
                this.unk2700DIMBABOGNEM_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearUnk2700DIMBABOGNEM() {
                this.unk2700DIMBABOGNEM_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getUnk2700IOMOHEKJJLJ() {
                return this.unk2700IOMOHEKJJLJ_;
            }
            
            public Builder setUnk2700IOMOHEKJJLJ(final int value) {
                this.unk2700IOMOHEKJJLJ_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearUnk2700IOMOHEKJJLJ() {
                this.unk2700IOMOHEKJJLJ_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getCorrectHit() {
                return this.correctHit_;
            }
            
            public Builder setCorrectHit(final int value) {
                this.correctHit_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearCorrectHit() {
                this.correctHit_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean getUnk2700LKJNLDJAGGL() {
                return this.unk2700LKJNLDJAGGL_;
            }
            
            public Builder setUnk2700LKJNLDJAGGL(final boolean value) {
                this.unk2700LKJNLDJAGGL_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearUnk2700LKJNLDJAGGL() {
                this.unk2700LKJNLDJAGGL_ = false;
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
    
    public interface MusicGameSettleReqOrBuilder extends MessageOrBuilder
    {
        List<Integer> getUnk2700GDPKOANEDEBList();
        
        int getUnk2700GDPKOANEDEBCount();
        
        int getUnk2700GDPKOANEDEB(final int p0);
        
        int getUnk2700NMHGADLANMM();
        
        List<Integer> getUnk2700NNHGOCJLKFHList();
        
        int getUnk2700NNHGOCJLKFHCount();
        
        int getUnk2700NNHGOCJLKFH(final int p0);
        
        int getUnk2700NCHHEJNFECG();
        
        int getScore();
        
        long getUnk2700CEPGMKAHHCD();
        
        int getUnk2700MMHHGALFHGA();
        
        boolean getUnk2700CBLIJHDFKHA();
        
        int getMaxCombo();
        
        int getUnk2700FBLBGPHMLAL();
        
        float getSpeed();
        
        boolean getUnk2700IOKPIKJDEHG();
        
        int getCombo();
        
        int getMusicBasicId();
        
        int getUnk2700DIMBABOGNEM();
        
        int getUnk2700IOMOHEKJJLJ();
        
        int getCorrectHit();
        
        boolean getUnk2700LKJNLDJAGGL();
    }
}
