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

public final class PotionDungeonResultInfoOuterClass
{
    private static final Descriptors.Descriptor internal_static_PotionDungeonResultInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_PotionDungeonResultInfo_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private PotionDungeonResultInfoOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return PotionDungeonResultInfoOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001dPotionDungeonResultInfo.proto\"\u009f\u0001\n\u0017PotionDungeonResultInfo\u0012\u0013\n\u000bfinal_score\u0018\b \u0001(\r\u0012\u0011\n\tleft_time\u0018\t \u0001(\r\u0012\u001b\n\u0013Unk2700_FHEHGDABALE\u0018\u000e \u0001(\r\u0012\u001b\n\u0013Unk2700_HKFEBBCMBHL\u0018\u000b \u0001(\r\u0012\u0010\n\blevel_id\u0018\u0004 \u0001(\r\u0012\u0010\n\bstage_id\u0018\u0002 \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        PotionDungeonResultInfoOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_PotionDungeonResultInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_PotionDungeonResultInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(PotionDungeonResultInfoOuterClass.internal_static_PotionDungeonResultInfo_descriptor, new String[] { "FinalScore", "LeftTime", "Unk2700FHEHGDABALE", "Unk2700HKFEBBCMBHL", "LevelId", "StageId" });
    }
    
    public static final class PotionDungeonResultInfo extends GeneratedMessageV3 implements PotionDungeonResultInfoOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int FINAL_SCORE_FIELD_NUMBER = 8;
        private int finalScore_;
        public static final int LEFT_TIME_FIELD_NUMBER = 9;
        private int leftTime_;
        public static final int UNK2700_FHEHGDABALE_FIELD_NUMBER = 14;
        private int unk2700FHEHGDABALE_;
        public static final int UNK2700_HKFEBBCMBHL_FIELD_NUMBER = 11;
        private int unk2700HKFEBBCMBHL_;
        public static final int LEVEL_ID_FIELD_NUMBER = 4;
        private int levelId_;
        public static final int STAGE_ID_FIELD_NUMBER = 2;
        private int stageId_;
        private byte memoizedIsInitialized;
        private static final PotionDungeonResultInfo DEFAULT_INSTANCE;
        private static final Parser<PotionDungeonResultInfo> PARSER;
        
        private PotionDungeonResultInfo(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private PotionDungeonResultInfo() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new PotionDungeonResultInfo();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private PotionDungeonResultInfo(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.stageId_ = input.readUInt32();
                            continue;
                        }
                        case 32: {
                            this.levelId_ = input.readUInt32();
                            continue;
                        }
                        case 64: {
                            this.finalScore_ = input.readUInt32();
                            continue;
                        }
                        case 72: {
                            this.leftTime_ = input.readUInt32();
                            continue;
                        }
                        case 88: {
                            this.unk2700HKFEBBCMBHL_ = input.readUInt32();
                            continue;
                        }
                        case 112: {
                            this.unk2700FHEHGDABALE_ = input.readUInt32();
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
            return PotionDungeonResultInfoOuterClass.internal_static_PotionDungeonResultInfo_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return PotionDungeonResultInfoOuterClass.internal_static_PotionDungeonResultInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(PotionDungeonResultInfo.class, Builder.class);
        }
        
        @Override
        public int getFinalScore() {
            return this.finalScore_;
        }
        
        @Override
        public int getLeftTime() {
            return this.leftTime_;
        }
        
        @Override
        public int getUnk2700FHEHGDABALE() {
            return this.unk2700FHEHGDABALE_;
        }
        
        @Override
        public int getUnk2700HKFEBBCMBHL() {
            return this.unk2700HKFEBBCMBHL_;
        }
        
        @Override
        public int getLevelId() {
            return this.levelId_;
        }
        
        @Override
        public int getStageId() {
            return this.stageId_;
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
            if (this.stageId_ != 0) {
                output.writeUInt32(2, this.stageId_);
            }
            if (this.levelId_ != 0) {
                output.writeUInt32(4, this.levelId_);
            }
            if (this.finalScore_ != 0) {
                output.writeUInt32(8, this.finalScore_);
            }
            if (this.leftTime_ != 0) {
                output.writeUInt32(9, this.leftTime_);
            }
            if (this.unk2700HKFEBBCMBHL_ != 0) {
                output.writeUInt32(11, this.unk2700HKFEBBCMBHL_);
            }
            if (this.unk2700FHEHGDABALE_ != 0) {
                output.writeUInt32(14, this.unk2700FHEHGDABALE_);
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
            if (this.stageId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(2, this.stageId_);
            }
            if (this.levelId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(4, this.levelId_);
            }
            if (this.finalScore_ != 0) {
                size += CodedOutputStream.computeUInt32Size(8, this.finalScore_);
            }
            if (this.leftTime_ != 0) {
                size += CodedOutputStream.computeUInt32Size(9, this.leftTime_);
            }
            if (this.unk2700HKFEBBCMBHL_ != 0) {
                size += CodedOutputStream.computeUInt32Size(11, this.unk2700HKFEBBCMBHL_);
            }
            if (this.unk2700FHEHGDABALE_ != 0) {
                size += CodedOutputStream.computeUInt32Size(14, this.unk2700FHEHGDABALE_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PotionDungeonResultInfo)) {
                return super.equals(obj);
            }
            final PotionDungeonResultInfo other = (PotionDungeonResultInfo)obj;
            return this.getFinalScore() == other.getFinalScore() && this.getLeftTime() == other.getLeftTime() && this.getUnk2700FHEHGDABALE() == other.getUnk2700FHEHGDABALE() && this.getUnk2700HKFEBBCMBHL() == other.getUnk2700HKFEBBCMBHL() && this.getLevelId() == other.getLevelId() && this.getStageId() == other.getStageId() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 8;
            hash = 53 * hash + this.getFinalScore();
            hash = 37 * hash + 9;
            hash = 53 * hash + this.getLeftTime();
            hash = 37 * hash + 14;
            hash = 53 * hash + this.getUnk2700FHEHGDABALE();
            hash = 37 * hash + 11;
            hash = 53 * hash + this.getUnk2700HKFEBBCMBHL();
            hash = 37 * hash + 4;
            hash = 53 * hash + this.getLevelId();
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getStageId();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static PotionDungeonResultInfo parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return PotionDungeonResultInfo.PARSER.parseFrom(data);
        }
        
        public static PotionDungeonResultInfo parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PotionDungeonResultInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PotionDungeonResultInfo parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return PotionDungeonResultInfo.PARSER.parseFrom(data);
        }
        
        public static PotionDungeonResultInfo parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PotionDungeonResultInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PotionDungeonResultInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return PotionDungeonResultInfo.PARSER.parseFrom(data);
        }
        
        public static PotionDungeonResultInfo parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PotionDungeonResultInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PotionDungeonResultInfo parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PotionDungeonResultInfo.PARSER, input);
        }
        
        public static PotionDungeonResultInfo parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PotionDungeonResultInfo.PARSER, input, extensionRegistry);
        }
        
        public static PotionDungeonResultInfo parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(PotionDungeonResultInfo.PARSER, input);
        }
        
        public static PotionDungeonResultInfo parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(PotionDungeonResultInfo.PARSER, input, extensionRegistry);
        }
        
        public static PotionDungeonResultInfo parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PotionDungeonResultInfo.PARSER, input);
        }
        
        public static PotionDungeonResultInfo parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PotionDungeonResultInfo.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return PotionDungeonResultInfo.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final PotionDungeonResultInfo prototype) {
            return PotionDungeonResultInfo.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == PotionDungeonResultInfo.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static PotionDungeonResultInfo getDefaultInstance() {
            return PotionDungeonResultInfo.DEFAULT_INSTANCE;
        }
        
        public static Parser<PotionDungeonResultInfo> parser() {
            return PotionDungeonResultInfo.PARSER;
        }
        
        @Override
        public Parser<PotionDungeonResultInfo> getParserForType() {
            return PotionDungeonResultInfo.PARSER;
        }
        
        @Override
        public PotionDungeonResultInfo getDefaultInstanceForType() {
            return PotionDungeonResultInfo.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new PotionDungeonResultInfo();
            PARSER = new AbstractParser<PotionDungeonResultInfo>() {
                @Override
                public PotionDungeonResultInfo parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new PotionDungeonResultInfo(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements PotionDungeonResultInfoOrBuilder
        {
            private int finalScore_;
            private int leftTime_;
            private int unk2700FHEHGDABALE_;
            private int unk2700HKFEBBCMBHL_;
            private int levelId_;
            private int stageId_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return PotionDungeonResultInfoOuterClass.internal_static_PotionDungeonResultInfo_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return PotionDungeonResultInfoOuterClass.internal_static_PotionDungeonResultInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(PotionDungeonResultInfo.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (PotionDungeonResultInfo.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.finalScore_ = 0;
                this.leftTime_ = 0;
                this.unk2700FHEHGDABALE_ = 0;
                this.unk2700HKFEBBCMBHL_ = 0;
                this.levelId_ = 0;
                this.stageId_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return PotionDungeonResultInfoOuterClass.internal_static_PotionDungeonResultInfo_descriptor;
            }
            
            @Override
            public PotionDungeonResultInfo getDefaultInstanceForType() {
                return PotionDungeonResultInfo.getDefaultInstance();
            }
            
            @Override
            public PotionDungeonResultInfo build() {
                final PotionDungeonResultInfo result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public PotionDungeonResultInfo buildPartial() {
                final PotionDungeonResultInfo result = new PotionDungeonResultInfo(this);
                result.finalScore_ = this.finalScore_;
                result.leftTime_ = this.leftTime_;
                result.unk2700FHEHGDABALE_ = this.unk2700FHEHGDABALE_;
                result.unk2700HKFEBBCMBHL_ = this.unk2700HKFEBBCMBHL_;
                result.levelId_ = this.levelId_;
                result.stageId_ = this.stageId_;
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
                if (other instanceof PotionDungeonResultInfo) {
                    return this.mergeFrom((PotionDungeonResultInfo)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final PotionDungeonResultInfo other) {
                if (other == PotionDungeonResultInfo.getDefaultInstance()) {
                    return this;
                }
                if (other.getFinalScore() != 0) {
                    this.setFinalScore(other.getFinalScore());
                }
                if (other.getLeftTime() != 0) {
                    this.setLeftTime(other.getLeftTime());
                }
                if (other.getUnk2700FHEHGDABALE() != 0) {
                    this.setUnk2700FHEHGDABALE(other.getUnk2700FHEHGDABALE());
                }
                if (other.getUnk2700HKFEBBCMBHL() != 0) {
                    this.setUnk2700HKFEBBCMBHL(other.getUnk2700HKFEBBCMBHL());
                }
                if (other.getLevelId() != 0) {
                    this.setLevelId(other.getLevelId());
                }
                if (other.getStageId() != 0) {
                    this.setStageId(other.getStageId());
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
                PotionDungeonResultInfo parsedMessage = null;
                try {
                    parsedMessage = PotionDungeonResultInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (PotionDungeonResultInfo)e.getUnfinishedMessage();
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
            public int getLeftTime() {
                return this.leftTime_;
            }
            
            public Builder setLeftTime(final int value) {
                this.leftTime_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearLeftTime() {
                this.leftTime_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getUnk2700FHEHGDABALE() {
                return this.unk2700FHEHGDABALE_;
            }
            
            public Builder setUnk2700FHEHGDABALE(final int value) {
                this.unk2700FHEHGDABALE_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearUnk2700FHEHGDABALE() {
                this.unk2700FHEHGDABALE_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getUnk2700HKFEBBCMBHL() {
                return this.unk2700HKFEBBCMBHL_;
            }
            
            public Builder setUnk2700HKFEBBCMBHL(final int value) {
                this.unk2700HKFEBBCMBHL_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearUnk2700HKFEBBCMBHL() {
                this.unk2700HKFEBBCMBHL_ = 0;
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
            public int getStageId() {
                return this.stageId_;
            }
            
            public Builder setStageId(final int value) {
                this.stageId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearStageId() {
                this.stageId_ = 0;
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
    
    public interface PotionDungeonResultInfoOrBuilder extends MessageOrBuilder
    {
        int getFinalScore();
        
        int getLeftTime();
        
        int getUnk2700FHEHGDABALE();
        
        int getUnk2700HKFEBBCMBHL();
        
        int getLevelId();
        
        int getStageId();
    }
}
