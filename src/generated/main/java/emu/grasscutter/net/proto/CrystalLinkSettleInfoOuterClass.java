// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.Message;
import java.io.InputStream;
import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
import com.google.protobuf.Internal;
import com.google.protobuf.CodedOutputStream;
import java.io.IOException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Parser;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class CrystalLinkSettleInfoOuterClass
{
    private static final Descriptors.Descriptor internal_static_CrystalLinkSettleInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_CrystalLinkSettleInfo_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private CrystalLinkSettleInfoOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return CrystalLinkSettleInfoOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001bCrystalLinkSettleInfo.proto\"\u00ad\u0001\n\u0015CrystalLinkSettleInfo\u0012\u001e\n\u0016kill_elite_monster_num\u0018\u0002 \u0001(\r\u0012\u0013\n\u000bfinal_score\u0018\u0006 \u0001(\r\u0012\u0010\n\blevel_id\u0018\f \u0001(\r\u0012\u0015\n\ris_new_record\u0018\r \u0001(\b\u0012\u0015\n\rdifficulty_id\u0018\t \u0001(\r\u0012\u001f\n\u0017kill_normal_mosnter_num\u0018\u0003 \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        CrystalLinkSettleInfoOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_CrystalLinkSettleInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_CrystalLinkSettleInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(CrystalLinkSettleInfoOuterClass.internal_static_CrystalLinkSettleInfo_descriptor, new String[] { "KillEliteMonsterNum", "FinalScore", "LevelId", "IsNewRecord", "DifficultyId", "KillNormalMosnterNum" });
    }
    
    public static final class CrystalLinkSettleInfo extends GeneratedMessageV3 implements CrystalLinkSettleInfoOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int KILL_ELITE_MONSTER_NUM_FIELD_NUMBER = 2;
        private int killEliteMonsterNum_;
        public static final int FINAL_SCORE_FIELD_NUMBER = 6;
        private int finalScore_;
        public static final int LEVEL_ID_FIELD_NUMBER = 12;
        private int levelId_;
        public static final int IS_NEW_RECORD_FIELD_NUMBER = 13;
        private boolean isNewRecord_;
        public static final int DIFFICULTY_ID_FIELD_NUMBER = 9;
        private int difficultyId_;
        public static final int KILL_NORMAL_MOSNTER_NUM_FIELD_NUMBER = 3;
        private int killNormalMosnterNum_;
        private byte memoizedIsInitialized;
        private static final CrystalLinkSettleInfo DEFAULT_INSTANCE;
        private static final Parser<CrystalLinkSettleInfo> PARSER;
        
        private CrystalLinkSettleInfo(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private CrystalLinkSettleInfo() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new CrystalLinkSettleInfo();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private CrystalLinkSettleInfo(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new NullPointerException();
            }
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
                        case 16: {
                            this.killEliteMonsterNum_ = input.readUInt32();
                            continue;
                        }
                        case 24: {
                            this.killNormalMosnterNum_ = input.readUInt32();
                            continue;
                        }
                        case 48: {
                            this.finalScore_ = input.readUInt32();
                            continue;
                        }
                        case 72: {
                            this.difficultyId_ = input.readUInt32();
                            continue;
                        }
                        case 96: {
                            this.levelId_ = input.readUInt32();
                            continue;
                        }
                        case 104: {
                            this.isNewRecord_ = input.readBool();
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
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return CrystalLinkSettleInfoOuterClass.internal_static_CrystalLinkSettleInfo_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return CrystalLinkSettleInfoOuterClass.internal_static_CrystalLinkSettleInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(CrystalLinkSettleInfo.class, Builder.class);
        }
        
        @Override
        public int getKillEliteMonsterNum() {
            return this.killEliteMonsterNum_;
        }
        
        @Override
        public int getFinalScore() {
            return this.finalScore_;
        }
        
        @Override
        public int getLevelId() {
            return this.levelId_;
        }
        
        @Override
        public boolean getIsNewRecord() {
            return this.isNewRecord_;
        }
        
        @Override
        public int getDifficultyId() {
            return this.difficultyId_;
        }
        
        @Override
        public int getKillNormalMosnterNum() {
            return this.killNormalMosnterNum_;
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
            if (this.killEliteMonsterNum_ != 0) {
                output.writeUInt32(2, this.killEliteMonsterNum_);
            }
            if (this.killNormalMosnterNum_ != 0) {
                output.writeUInt32(3, this.killNormalMosnterNum_);
            }
            if (this.finalScore_ != 0) {
                output.writeUInt32(6, this.finalScore_);
            }
            if (this.difficultyId_ != 0) {
                output.writeUInt32(9, this.difficultyId_);
            }
            if (this.levelId_ != 0) {
                output.writeUInt32(12, this.levelId_);
            }
            if (this.isNewRecord_) {
                output.writeBool(13, this.isNewRecord_);
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
            if (this.killEliteMonsterNum_ != 0) {
                size += CodedOutputStream.computeUInt32Size(2, this.killEliteMonsterNum_);
            }
            if (this.killNormalMosnterNum_ != 0) {
                size += CodedOutputStream.computeUInt32Size(3, this.killNormalMosnterNum_);
            }
            if (this.finalScore_ != 0) {
                size += CodedOutputStream.computeUInt32Size(6, this.finalScore_);
            }
            if (this.difficultyId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(9, this.difficultyId_);
            }
            if (this.levelId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(12, this.levelId_);
            }
            if (this.isNewRecord_) {
                size += CodedOutputStream.computeBoolSize(13, this.isNewRecord_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CrystalLinkSettleInfo)) {
                return super.equals(obj);
            }
            final CrystalLinkSettleInfo other = (CrystalLinkSettleInfo)obj;
            return this.getKillEliteMonsterNum() == other.getKillEliteMonsterNum() && this.getFinalScore() == other.getFinalScore() && this.getLevelId() == other.getLevelId() && this.getIsNewRecord() == other.getIsNewRecord() && this.getDifficultyId() == other.getDifficultyId() && this.getKillNormalMosnterNum() == other.getKillNormalMosnterNum() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getKillEliteMonsterNum();
            hash = 37 * hash + 6;
            hash = 53 * hash + this.getFinalScore();
            hash = 37 * hash + 12;
            hash = 53 * hash + this.getLevelId();
            hash = 37 * hash + 13;
            hash = 53 * hash + Internal.hashBoolean(this.getIsNewRecord());
            hash = 37 * hash + 9;
            hash = 53 * hash + this.getDifficultyId();
            hash = 37 * hash + 3;
            hash = 53 * hash + this.getKillNormalMosnterNum();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static CrystalLinkSettleInfo parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return CrystalLinkSettleInfo.PARSER.parseFrom(data);
        }
        
        public static CrystalLinkSettleInfo parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return CrystalLinkSettleInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static CrystalLinkSettleInfo parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return CrystalLinkSettleInfo.PARSER.parseFrom(data);
        }
        
        public static CrystalLinkSettleInfo parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return CrystalLinkSettleInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static CrystalLinkSettleInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return CrystalLinkSettleInfo.PARSER.parseFrom(data);
        }
        
        public static CrystalLinkSettleInfo parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return CrystalLinkSettleInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static CrystalLinkSettleInfo parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CrystalLinkSettleInfo.PARSER, input);
        }
        
        public static CrystalLinkSettleInfo parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CrystalLinkSettleInfo.PARSER, input, extensionRegistry);
        }
        
        public static CrystalLinkSettleInfo parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(CrystalLinkSettleInfo.PARSER, input);
        }
        
        public static CrystalLinkSettleInfo parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(CrystalLinkSettleInfo.PARSER, input, extensionRegistry);
        }
        
        public static CrystalLinkSettleInfo parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CrystalLinkSettleInfo.PARSER, input);
        }
        
        public static CrystalLinkSettleInfo parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CrystalLinkSettleInfo.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return CrystalLinkSettleInfo.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final CrystalLinkSettleInfo prototype) {
            return CrystalLinkSettleInfo.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == CrystalLinkSettleInfo.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static CrystalLinkSettleInfo getDefaultInstance() {
            return CrystalLinkSettleInfo.DEFAULT_INSTANCE;
        }
        
        public static Parser<CrystalLinkSettleInfo> parser() {
            return CrystalLinkSettleInfo.PARSER;
        }
        
        @Override
        public Parser<CrystalLinkSettleInfo> getParserForType() {
            return CrystalLinkSettleInfo.PARSER;
        }
        
        @Override
        public CrystalLinkSettleInfo getDefaultInstanceForType() {
            return CrystalLinkSettleInfo.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new CrystalLinkSettleInfo();
            PARSER = new AbstractParser<CrystalLinkSettleInfo>() {
                @Override
                public CrystalLinkSettleInfo parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new CrystalLinkSettleInfo(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CrystalLinkSettleInfoOrBuilder
        {
            private int killEliteMonsterNum_;
            private int finalScore_;
            private int levelId_;
            private boolean isNewRecord_;
            private int difficultyId_;
            private int killNormalMosnterNum_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return CrystalLinkSettleInfoOuterClass.internal_static_CrystalLinkSettleInfo_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return CrystalLinkSettleInfoOuterClass.internal_static_CrystalLinkSettleInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(CrystalLinkSettleInfo.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (CrystalLinkSettleInfo.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.killEliteMonsterNum_ = 0;
                this.finalScore_ = 0;
                this.levelId_ = 0;
                this.isNewRecord_ = false;
                this.difficultyId_ = 0;
                this.killNormalMosnterNum_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return CrystalLinkSettleInfoOuterClass.internal_static_CrystalLinkSettleInfo_descriptor;
            }
            
            @Override
            public CrystalLinkSettleInfo getDefaultInstanceForType() {
                return CrystalLinkSettleInfo.getDefaultInstance();
            }
            
            @Override
            public CrystalLinkSettleInfo build() {
                final CrystalLinkSettleInfo result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public CrystalLinkSettleInfo buildPartial() {
                final CrystalLinkSettleInfo result = new CrystalLinkSettleInfo(this);
                result.killEliteMonsterNum_ = this.killEliteMonsterNum_;
                result.finalScore_ = this.finalScore_;
                result.levelId_ = this.levelId_;
                result.isNewRecord_ = this.isNewRecord_;
                result.difficultyId_ = this.difficultyId_;
                result.killNormalMosnterNum_ = this.killNormalMosnterNum_;
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
                if (other instanceof CrystalLinkSettleInfo) {
                    return this.mergeFrom((CrystalLinkSettleInfo)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final CrystalLinkSettleInfo other) {
                if (other == CrystalLinkSettleInfo.getDefaultInstance()) {
                    return this;
                }
                if (other.getKillEliteMonsterNum() != 0) {
                    this.setKillEliteMonsterNum(other.getKillEliteMonsterNum());
                }
                if (other.getFinalScore() != 0) {
                    this.setFinalScore(other.getFinalScore());
                }
                if (other.getLevelId() != 0) {
                    this.setLevelId(other.getLevelId());
                }
                if (other.getIsNewRecord()) {
                    this.setIsNewRecord(other.getIsNewRecord());
                }
                if (other.getDifficultyId() != 0) {
                    this.setDifficultyId(other.getDifficultyId());
                }
                if (other.getKillNormalMosnterNum() != 0) {
                    this.setKillNormalMosnterNum(other.getKillNormalMosnterNum());
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
                CrystalLinkSettleInfo parsedMessage = null;
                try {
                    parsedMessage = CrystalLinkSettleInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (CrystalLinkSettleInfo)e.getUnfinishedMessage();
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
            public int getKillEliteMonsterNum() {
                return this.killEliteMonsterNum_;
            }
            
            public Builder setKillEliteMonsterNum(final int value) {
                this.killEliteMonsterNum_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearKillEliteMonsterNum() {
                this.killEliteMonsterNum_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getFinalScore() {
                return this.finalScore_;
            }
            
            public Builder setFinalScore(final int value) {
                this.finalScore_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearFinalScore() {
                this.finalScore_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getLevelId() {
                return this.levelId_;
            }
            
            public Builder setLevelId(final int value) {
                this.levelId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearLevelId() {
                this.levelId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean getIsNewRecord() {
                return this.isNewRecord_;
            }
            
            public Builder setIsNewRecord(final boolean value) {
                this.isNewRecord_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIsNewRecord() {
                this.isNewRecord_ = false;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getDifficultyId() {
                return this.difficultyId_;
            }
            
            public Builder setDifficultyId(final int value) {
                this.difficultyId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearDifficultyId() {
                this.difficultyId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getKillNormalMosnterNum() {
                return this.killNormalMosnterNum_;
            }
            
            public Builder setKillNormalMosnterNum(final int value) {
                this.killNormalMosnterNum_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearKillNormalMosnterNum() {
                this.killNormalMosnterNum_ = 0;
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
    
    public interface CrystalLinkSettleInfoOrBuilder extends MessageOrBuilder
    {
        int getKillEliteMonsterNum();
        
        int getFinalScore();
        
        int getLevelId();
        
        boolean getIsNewRecord();
        
        int getDifficultyId();
        
        int getKillNormalMosnterNum();
    }
}
