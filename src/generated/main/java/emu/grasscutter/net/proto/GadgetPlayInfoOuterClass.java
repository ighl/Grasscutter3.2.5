// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import java.util.Collections;
import java.util.Collection;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.AbstractMessageLite;
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

public final class GadgetPlayInfoOuterClass
{
    private static final Descriptors.Descriptor internal_static_GadgetPlayInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GadgetPlayInfo_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private GadgetPlayInfoOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return GadgetPlayInfoOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0014GadgetPlayInfo.proto\u001a\u0018GadgetCrucibleInfo.proto\"\u00c5\u0001\n\u000eGadgetPlayInfo\u0012\u0011\n\tplay_type\u0018\u0001 \u0001(\r\u0012\u0010\n\bduration\u0018\u0002 \u0001(\r\u0012\u001b\n\u0013progress_stage_list\u0018\u0003 \u0003(\r\u0012\u0010\n\bstart_cd\u0018\u0004 \u0001(\r\u0012\u0012\n\nstart_time\u0018\u0005 \u0001(\r\u0012\u0010\n\bprogress\u0018\u0006 \u0001(\r\u0012,\n\rcrucible_info\u0018\u0015 \u0001(\u000b2\u0013.GadgetCrucibleInfoH\u0000B\u000b\n\tplay_infoB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        GadgetPlayInfoOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { GadgetCrucibleInfoOuterClass.getDescriptor() });
        internal_static_GadgetPlayInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_GadgetPlayInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(GadgetPlayInfoOuterClass.internal_static_GadgetPlayInfo_descriptor, new String[] { "PlayType", "Duration", "ProgressStageList", "StartCd", "StartTime", "Progress", "CrucibleInfo", "PlayInfo" });
        GadgetCrucibleInfoOuterClass.getDescriptor();
    }
    
    public static final class GadgetPlayInfo extends GeneratedMessageV3 implements GadgetPlayInfoOrBuilder
    {
        private static final long serialVersionUID = 0L;
        private int playInfoCase_;
        private Object playInfo_;
        public static final int PLAY_TYPE_FIELD_NUMBER = 1;
        private int playType_;
        public static final int DURATION_FIELD_NUMBER = 2;
        private int duration_;
        public static final int PROGRESS_STAGE_LIST_FIELD_NUMBER = 3;
        private Internal.IntList progressStageList_;
        private int progressStageListMemoizedSerializedSize;
        public static final int START_CD_FIELD_NUMBER = 4;
        private int startCd_;
        public static final int START_TIME_FIELD_NUMBER = 5;
        private int startTime_;
        public static final int PROGRESS_FIELD_NUMBER = 6;
        private int progress_;
        public static final int CRUCIBLE_INFO_FIELD_NUMBER = 21;
        private byte memoizedIsInitialized;
        private static final GadgetPlayInfo DEFAULT_INSTANCE;
        private static final Parser<GadgetPlayInfo> PARSER;
        
        private GadgetPlayInfo(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.playInfoCase_ = 0;
            this.progressStageListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
        }
        
        private GadgetPlayInfo() {
            this.playInfoCase_ = 0;
            this.progressStageListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.progressStageList_ = GeneratedMessageV3.emptyIntList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new GadgetPlayInfo();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private GadgetPlayInfo(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.playType_ = input.readUInt32();
                            continue;
                        }
                        case 16: {
                            this.duration_ = input.readUInt32();
                            continue;
                        }
                        case 24: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.progressStageList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.progressStageList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 26: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x1) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.progressStageList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.progressStageList_.addInt(input.readUInt32());
                            }
                            input.popLimit(limit);
                            continue;
                        }
                        case 32: {
                            this.startCd_ = input.readUInt32();
                            continue;
                        }
                        case 40: {
                            this.startTime_ = input.readUInt32();
                            continue;
                        }
                        case 48: {
                            this.progress_ = input.readUInt32();
                            continue;
                        }
                        case 170: {
                            GadgetCrucibleInfoOuterClass.GadgetCrucibleInfo.Builder subBuilder = null;
                            if (this.playInfoCase_ == 21) {
                                subBuilder = ((GadgetCrucibleInfoOuterClass.GadgetCrucibleInfo)this.playInfo_).toBuilder();
                            }
                            this.playInfo_ = input.readMessage(GadgetCrucibleInfoOuterClass.GadgetCrucibleInfo.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom((GadgetCrucibleInfoOuterClass.GadgetCrucibleInfo)this.playInfo_);
                                this.playInfo_ = subBuilder.buildPartial();
                            }
                            this.playInfoCase_ = 21;
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
                    this.progressStageList_.makeImmutable();
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return GadgetPlayInfoOuterClass.internal_static_GadgetPlayInfo_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return GadgetPlayInfoOuterClass.internal_static_GadgetPlayInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(GadgetPlayInfo.class, Builder.class);
        }
        
        @Override
        public PlayInfoCase getPlayInfoCase() {
            return PlayInfoCase.forNumber(this.playInfoCase_);
        }
        
        @Override
        public int getPlayType() {
            return this.playType_;
        }
        
        @Override
        public int getDuration() {
            return this.duration_;
        }
        
        @Override
        public List<Integer> getProgressStageListList() {
            return this.progressStageList_;
        }
        
        @Override
        public int getProgressStageListCount() {
            return this.progressStageList_.size();
        }
        
        @Override
        public int getProgressStageList(final int index) {
            return this.progressStageList_.getInt(index);
        }
        
        @Override
        public int getStartCd() {
            return this.startCd_;
        }
        
        @Override
        public int getStartTime() {
            return this.startTime_;
        }
        
        @Override
        public int getProgress() {
            return this.progress_;
        }
        
        @Override
        public boolean hasCrucibleInfo() {
            return this.playInfoCase_ == 21;
        }
        
        @Override
        public GadgetCrucibleInfoOuterClass.GadgetCrucibleInfo getCrucibleInfo() {
            if (this.playInfoCase_ == 21) {
                return (GadgetCrucibleInfoOuterClass.GadgetCrucibleInfo)this.playInfo_;
            }
            return GadgetCrucibleInfoOuterClass.GadgetCrucibleInfo.getDefaultInstance();
        }
        
        @Override
        public GadgetCrucibleInfoOuterClass.GadgetCrucibleInfoOrBuilder getCrucibleInfoOrBuilder() {
            if (this.playInfoCase_ == 21) {
                return (GadgetCrucibleInfoOuterClass.GadgetCrucibleInfo)this.playInfo_;
            }
            return GadgetCrucibleInfoOuterClass.GadgetCrucibleInfo.getDefaultInstance();
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
            if (this.playType_ != 0) {
                output.writeUInt32(1, this.playType_);
            }
            if (this.duration_ != 0) {
                output.writeUInt32(2, this.duration_);
            }
            if (this.getProgressStageListList().size() > 0) {
                output.writeUInt32NoTag(26);
                output.writeUInt32NoTag(this.progressStageListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.progressStageList_.size(); ++i) {
                output.writeUInt32NoTag(this.progressStageList_.getInt(i));
            }
            if (this.startCd_ != 0) {
                output.writeUInt32(4, this.startCd_);
            }
            if (this.startTime_ != 0) {
                output.writeUInt32(5, this.startTime_);
            }
            if (this.progress_ != 0) {
                output.writeUInt32(6, this.progress_);
            }
            if (this.playInfoCase_ == 21) {
                output.writeMessage(21, (MessageLite)this.playInfo_);
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
            if (this.playType_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1, this.playType_);
            }
            if (this.duration_ != 0) {
                size += CodedOutputStream.computeUInt32Size(2, this.duration_);
            }
            int dataSize = 0;
            for (int i = 0; i < this.progressStageList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.progressStageList_.getInt(i));
            }
            size += dataSize;
            if (!this.getProgressStageListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.progressStageListMemoizedSerializedSize = dataSize;
            if (this.startCd_ != 0) {
                size += CodedOutputStream.computeUInt32Size(4, this.startCd_);
            }
            if (this.startTime_ != 0) {
                size += CodedOutputStream.computeUInt32Size(5, this.startTime_);
            }
            if (this.progress_ != 0) {
                size += CodedOutputStream.computeUInt32Size(6, this.progress_);
            }
            if (this.playInfoCase_ == 21) {
                size += CodedOutputStream.computeMessageSize(21, (MessageLite)this.playInfo_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GadgetPlayInfo)) {
                return super.equals(obj);
            }
            final GadgetPlayInfo other = (GadgetPlayInfo)obj;
            if (this.getPlayType() != other.getPlayType()) {
                return false;
            }
            if (this.getDuration() != other.getDuration()) {
                return false;
            }
            if (!this.getProgressStageListList().equals(other.getProgressStageListList())) {
                return false;
            }
            if (this.getStartCd() != other.getStartCd()) {
                return false;
            }
            if (this.getStartTime() != other.getStartTime()) {
                return false;
            }
            if (this.getProgress() != other.getProgress()) {
                return false;
            }
            if (!this.getPlayInfoCase().equals(other.getPlayInfoCase())) {
                return false;
            }
            switch (this.playInfoCase_) {
                case 21: {
                    if (!this.getCrucibleInfo().equals(other.getCrucibleInfo())) {
                        return false;
                    }
                    break;
                }
            }
            return this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getPlayType();
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getDuration();
            if (this.getProgressStageListCount() > 0) {
                hash = 37 * hash + 3;
                hash = 53 * hash + this.getProgressStageListList().hashCode();
            }
            hash = 37 * hash + 4;
            hash = 53 * hash + this.getStartCd();
            hash = 37 * hash + 5;
            hash = 53 * hash + this.getStartTime();
            hash = 37 * hash + 6;
            hash = 53 * hash + this.getProgress();
            switch (this.playInfoCase_) {
                case 21: {
                    hash = 37 * hash + 21;
                    hash = 53 * hash + this.getCrucibleInfo().hashCode();
                    break;
                }
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static GadgetPlayInfo parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return GadgetPlayInfo.PARSER.parseFrom(data);
        }
        
        public static GadgetPlayInfo parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GadgetPlayInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GadgetPlayInfo parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return GadgetPlayInfo.PARSER.parseFrom(data);
        }
        
        public static GadgetPlayInfo parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GadgetPlayInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GadgetPlayInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return GadgetPlayInfo.PARSER.parseFrom(data);
        }
        
        public static GadgetPlayInfo parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GadgetPlayInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GadgetPlayInfo parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GadgetPlayInfo.PARSER, input);
        }
        
        public static GadgetPlayInfo parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GadgetPlayInfo.PARSER, input, extensionRegistry);
        }
        
        public static GadgetPlayInfo parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(GadgetPlayInfo.PARSER, input);
        }
        
        public static GadgetPlayInfo parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(GadgetPlayInfo.PARSER, input, extensionRegistry);
        }
        
        public static GadgetPlayInfo parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GadgetPlayInfo.PARSER, input);
        }
        
        public static GadgetPlayInfo parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GadgetPlayInfo.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return GadgetPlayInfo.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final GadgetPlayInfo prototype) {
            return GadgetPlayInfo.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == GadgetPlayInfo.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static GadgetPlayInfo getDefaultInstance() {
            return GadgetPlayInfo.DEFAULT_INSTANCE;
        }
        
        public static Parser<GadgetPlayInfo> parser() {
            return GadgetPlayInfo.PARSER;
        }
        
        @Override
        public Parser<GadgetPlayInfo> getParserForType() {
            return GadgetPlayInfo.PARSER;
        }
        
        @Override
        public GadgetPlayInfo getDefaultInstanceForType() {
            return GadgetPlayInfo.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new GadgetPlayInfo();
            PARSER = new AbstractParser<GadgetPlayInfo>() {
                @Override
                public GadgetPlayInfo parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new GadgetPlayInfo(input, extensionRegistry);
                }
            };
        }
        
        public enum PlayInfoCase implements Internal.EnumLite, InternalOneOfEnum
        {
            CRUCIBLE_INFO(21), 
            PLAYINFO_NOT_SET(0);
            
            private final int value;
            
            private PlayInfoCase(final int value) {
                this.value = value;
            }
            
            @Deprecated
            public static PlayInfoCase valueOf(final int value) {
                return forNumber(value);
            }
            
            public static PlayInfoCase forNumber(final int value) {
                switch (value) {
                    case 21: {
                        return PlayInfoCase.CRUCIBLE_INFO;
                    }
                    case 0: {
                        return PlayInfoCase.PLAYINFO_NOT_SET;
                    }
                    default: {
                        return null;
                    }
                }
            }
            
            @Override
            public int getNumber() {
                return this.value;
            }
            
            private static /* synthetic */ PlayInfoCase[] value() {
                return new PlayInfoCase[] { PlayInfoCase.CRUCIBLE_INFO, PlayInfoCase.PLAYINFO_NOT_SET };
            }
            
            
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GadgetPlayInfoOrBuilder
        {
            private int playInfoCase_;
            private Object playInfo_;
            private int bitField0_;
            private int playType_;
            private int duration_;
            private Internal.IntList progressStageList_;
            private int startCd_;
            private int startTime_;
            private int progress_;
            private SingleFieldBuilderV3<GadgetCrucibleInfoOuterClass.GadgetCrucibleInfo, GadgetCrucibleInfoOuterClass.GadgetCrucibleInfo.Builder, GadgetCrucibleInfoOuterClass.GadgetCrucibleInfoOrBuilder> crucibleInfoBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return GadgetPlayInfoOuterClass.internal_static_GadgetPlayInfo_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return GadgetPlayInfoOuterClass.internal_static_GadgetPlayInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(GadgetPlayInfo.class, Builder.class);
            }
            
            private Builder() {
                this.playInfoCase_ = 0;
                this.progressStageList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.playInfoCase_ = 0;
                this.progressStageList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (GadgetPlayInfo.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.playType_ = 0;
                this.duration_ = 0;
                this.progressStageList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                this.startCd_ = 0;
                this.startTime_ = 0;
                this.progress_ = 0;
                this.playInfoCase_ = 0;
                this.playInfo_ = null;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return GadgetPlayInfoOuterClass.internal_static_GadgetPlayInfo_descriptor;
            }
            
            @Override
            public GadgetPlayInfo getDefaultInstanceForType() {
                return GadgetPlayInfo.getDefaultInstance();
            }
            
            @Override
            public GadgetPlayInfo build() {
                final GadgetPlayInfo result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public GadgetPlayInfo buildPartial() {
                final GadgetPlayInfo result = new GadgetPlayInfo(this);
                final int from_bitField0_ = this.bitField0_;
                result.playType_ = this.playType_;
                result.duration_ = this.duration_;
                if ((this.bitField0_ & 0x1) != 0x0) {
                    this.progressStageList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                result.progressStageList_ = this.progressStageList_;
                result.startCd_ = this.startCd_;
                result.startTime_ = this.startTime_;
                result.progress_ = this.progress_;
                if (this.playInfoCase_ == 21) {
                    if (this.crucibleInfoBuilder_ == null) {
                        result.playInfo_ = this.playInfo_;
                    }
                    else {
                        result.playInfo_ = this.crucibleInfoBuilder_.build();
                    }
                }
                result.playInfoCase_ = this.playInfoCase_;
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
                if (other instanceof GadgetPlayInfo) {
                    return this.mergeFrom((GadgetPlayInfo)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final GadgetPlayInfo other) {
                if (other == GadgetPlayInfo.getDefaultInstance()) {
                    return this;
                }
                if (other.getPlayType() != 0) {
                    this.setPlayType(other.getPlayType());
                }
                if (other.getDuration() != 0) {
                    this.setDuration(other.getDuration());
                }
                if (!other.progressStageList_.isEmpty()) {
                    if (this.progressStageList_.isEmpty()) {
                        this.progressStageList_ = other.progressStageList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    else {
                        this.ensureProgressStageListIsMutable();
                        this.progressStageList_.addAll(other.progressStageList_);
                    }
                    this.onChanged();
                }
                if (other.getStartCd() != 0) {
                    this.setStartCd(other.getStartCd());
                }
                if (other.getStartTime() != 0) {
                    this.setStartTime(other.getStartTime());
                }
                if (other.getProgress() != 0) {
                    this.setProgress(other.getProgress());
                }
                switch (other.getPlayInfoCase()) {
                    case CRUCIBLE_INFO: {
                        this.mergeCrucibleInfo(other.getCrucibleInfo());
                        break;
                    }
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
                GadgetPlayInfo parsedMessage = null;
                try {
                    parsedMessage = GadgetPlayInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GadgetPlayInfo)e.getUnfinishedMessage();
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
            public PlayInfoCase getPlayInfoCase() {
                return PlayInfoCase.forNumber(this.playInfoCase_);
            }
            
            public Builder clearPlayInfo() {
                this.playInfoCase_ = 0;
                this.playInfo_ = null;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getPlayType() {
                return this.playType_;
            }
            
            public Builder setPlayType(final int value) {
                this.playType_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearPlayType() {
                this.playType_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getDuration() {
                return this.duration_;
            }
            
            public Builder setDuration(final int value) {
                this.duration_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearDuration() {
                this.duration_ = 0;
                this.onChanged();
                return this;
            }
            
            private void ensureProgressStageListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.progressStageList_ = GeneratedMessageV3.mutableCopy(this.progressStageList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<Integer> getProgressStageListList() {
                return ((this.bitField0_ & 0x1) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.progressStageList_) : this.progressStageList_;
            }
            
            @Override
            public int getProgressStageListCount() {
                return this.progressStageList_.size();
            }
            
            @Override
            public int getProgressStageList(final int index) {
                return this.progressStageList_.getInt(index);
            }
            
            public Builder setProgressStageList(final int index, final int value) {
                this.ensureProgressStageListIsMutable();
                this.progressStageList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addProgressStageList(final int value) {
                this.ensureProgressStageListIsMutable();
                this.progressStageList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllProgressStageList(final Iterable<? extends Integer> values) {
                this.ensureProgressStageListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.progressStageList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearProgressStageList() {
                this.progressStageList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getStartCd() {
                return this.startCd_;
            }
            
            public Builder setStartCd(final int value) {
                this.startCd_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearStartCd() {
                this.startCd_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getStartTime() {
                return this.startTime_;
            }
            
            public Builder setStartTime(final int value) {
                this.startTime_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearStartTime() {
                this.startTime_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getProgress() {
                return this.progress_;
            }
            
            public Builder setProgress(final int value) {
                this.progress_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearProgress() {
                this.progress_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean hasCrucibleInfo() {
                return this.playInfoCase_ == 21;
            }
            
            @Override
            public GadgetCrucibleInfoOuterClass.GadgetCrucibleInfo getCrucibleInfo() {
                if (this.crucibleInfoBuilder_ == null) {
                    if (this.playInfoCase_ == 21) {
                        return (GadgetCrucibleInfoOuterClass.GadgetCrucibleInfo)this.playInfo_;
                    }
                    return GadgetCrucibleInfoOuterClass.GadgetCrucibleInfo.getDefaultInstance();
                }
                else {
                    if (this.playInfoCase_ == 21) {
                        return this.crucibleInfoBuilder_.getMessage();
                    }
                    return GadgetCrucibleInfoOuterClass.GadgetCrucibleInfo.getDefaultInstance();
                }
            }
            
            public Builder setCrucibleInfo(final GadgetCrucibleInfoOuterClass.GadgetCrucibleInfo value) {
                if (this.crucibleInfoBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.playInfo_ = value;
                    this.onChanged();
                }
                else {
                    this.crucibleInfoBuilder_.setMessage(value);
                }
                this.playInfoCase_ = 21;
                return this;
            }
            
            public Builder setCrucibleInfo(final GadgetCrucibleInfoOuterClass.GadgetCrucibleInfo.Builder builderForValue) {
                if (this.crucibleInfoBuilder_ == null) {
                    this.playInfo_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.crucibleInfoBuilder_.setMessage(builderForValue.build());
                }
                this.playInfoCase_ = 21;
                return this;
            }
            
            public Builder mergeCrucibleInfo(final GadgetCrucibleInfoOuterClass.GadgetCrucibleInfo value) {
                if (this.crucibleInfoBuilder_ == null) {
                    if (this.playInfoCase_ == 21 && this.playInfo_ != GadgetCrucibleInfoOuterClass.GadgetCrucibleInfo.getDefaultInstance()) {
                        this.playInfo_ = GadgetCrucibleInfoOuterClass.GadgetCrucibleInfo.newBuilder((GadgetCrucibleInfoOuterClass.GadgetCrucibleInfo)this.playInfo_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.playInfo_ = value;
                    }
                    this.onChanged();
                }
                else {
                    if (this.playInfoCase_ == 21) {
                        this.crucibleInfoBuilder_.mergeFrom(value);
                    }
                    this.crucibleInfoBuilder_.setMessage(value);
                }
                this.playInfoCase_ = 21;
                return this;
            }
            
            public Builder clearCrucibleInfo() {
                if (this.crucibleInfoBuilder_ == null) {
                    if (this.playInfoCase_ == 21) {
                        this.playInfoCase_ = 0;
                        this.playInfo_ = null;
                        this.onChanged();
                    }
                }
                else {
                    if (this.playInfoCase_ == 21) {
                        this.playInfoCase_ = 0;
                        this.playInfo_ = null;
                    }
                    this.crucibleInfoBuilder_.clear();
                }
                return this;
            }
            
            public GadgetCrucibleInfoOuterClass.GadgetCrucibleInfo.Builder getCrucibleInfoBuilder() {
                return this.getCrucibleInfoFieldBuilder().getBuilder();
            }
            
            @Override
            public GadgetCrucibleInfoOuterClass.GadgetCrucibleInfoOrBuilder getCrucibleInfoOrBuilder() {
                if (this.playInfoCase_ == 21 && this.crucibleInfoBuilder_ != null) {
                    return this.crucibleInfoBuilder_.getMessageOrBuilder();
                }
                if (this.playInfoCase_ == 21) {
                    return (GadgetCrucibleInfoOuterClass.GadgetCrucibleInfo)this.playInfo_;
                }
                return GadgetCrucibleInfoOuterClass.GadgetCrucibleInfo.getDefaultInstance();
            }
            
            private SingleFieldBuilderV3<GadgetCrucibleInfoOuterClass.GadgetCrucibleInfo, GadgetCrucibleInfoOuterClass.GadgetCrucibleInfo.Builder, GadgetCrucibleInfoOuterClass.GadgetCrucibleInfoOrBuilder> getCrucibleInfoFieldBuilder() {
                if (this.crucibleInfoBuilder_ == null) {
                    if (this.playInfoCase_ != 21) {
                        this.playInfo_ = GadgetCrucibleInfoOuterClass.GadgetCrucibleInfo.getDefaultInstance();
                    }
                    this.crucibleInfoBuilder_ = new SingleFieldBuilderV3<GadgetCrucibleInfoOuterClass.GadgetCrucibleInfo, GadgetCrucibleInfoOuterClass.GadgetCrucibleInfo.Builder, GadgetCrucibleInfoOuterClass.GadgetCrucibleInfoOrBuilder>((GadgetCrucibleInfoOuterClass.GadgetCrucibleInfo)this.playInfo_, this.getParentForChildren(), this.isClean());
                    this.playInfo_ = null;
                }
                this.playInfoCase_ = 21;
                this.onChanged();
                return this.crucibleInfoBuilder_;
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
    
    public interface GadgetPlayInfoOrBuilder extends MessageOrBuilder
    {
        int getPlayType();
        
        int getDuration();
        
        List<Integer> getProgressStageListList();
        
        int getProgressStageListCount();
        
        int getProgressStageList(final int p0);
        
        int getStartCd();
        
        int getStartTime();
        
        int getProgress();
        
        boolean hasCrucibleInfo();
        
        GadgetCrucibleInfoOuterClass.GadgetCrucibleInfo getCrucibleInfo();
        
        GadgetCrucibleInfoOuterClass.GadgetCrucibleInfoOrBuilder getCrucibleInfoOrBuilder();
        
        GadgetPlayInfo.PlayInfoCase getPlayInfoCase();
    }
}
