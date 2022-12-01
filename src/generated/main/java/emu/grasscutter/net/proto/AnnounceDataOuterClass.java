// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.Message;
import java.io.InputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Internal;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ByteString;
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

public final class AnnounceDataOuterClass
{
    private static final Descriptors.Descriptor internal_static_AnnounceData_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_AnnounceData_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private AnnounceDataOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return AnnounceDataOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0012AnnounceData.proto\"\u0087\u0002\n\fAnnounceData\u0012\u0017\n\u000fcount_down_text\u0018\t \u0001(\t\u0012\u001a\n\u0012center_system_text\u0018\b \u0001(\t\u0012\u001c\n\u0014count_down_frequency\u0018\u0001 \u0001(\r\u0012\u0011\n\tconfig_id\u0018\u0007 \u0001(\r\u0012\u0012\n\nbegin_time\u0018\u0004 \u0001(\r\u0012\u001f\n\u0017center_system_frequency\u0018\u000b \u0001(\r\u0012\u001c\n\u0014dungeon_confirm_text\u0018\u0002 \u0001(\t\u0012,\n$is_center_system_last5_every_minutes\u0018\u000e \u0001(\b\u0012\u0010\n\bend_time\u0018\n \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        AnnounceDataOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_AnnounceData_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_AnnounceData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(AnnounceDataOuterClass.internal_static_AnnounceData_descriptor, new String[] { "CountDownText", "CenterSystemText", "CountDownFrequency", "ConfigId", "BeginTime", "CenterSystemFrequency", "DungeonConfirmText", "IsCenterSystemLast5EveryMinutes", "EndTime" });
    }
    
    public static final class AnnounceData extends GeneratedMessageV3 implements AnnounceDataOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int COUNT_DOWN_TEXT_FIELD_NUMBER = 9;
        private volatile Object countDownText_;
        public static final int CENTER_SYSTEM_TEXT_FIELD_NUMBER = 8;
        private volatile Object centerSystemText_;
        public static final int COUNT_DOWN_FREQUENCY_FIELD_NUMBER = 1;
        private int countDownFrequency_;
        public static final int CONFIG_ID_FIELD_NUMBER = 7;
        private int configId_;
        public static final int BEGIN_TIME_FIELD_NUMBER = 4;
        private int beginTime_;
        public static final int CENTER_SYSTEM_FREQUENCY_FIELD_NUMBER = 11;
        private int centerSystemFrequency_;
        public static final int DUNGEON_CONFIRM_TEXT_FIELD_NUMBER = 2;
        private volatile Object dungeonConfirmText_;
        public static final int IS_CENTER_SYSTEM_LAST5_EVERY_MINUTES_FIELD_NUMBER = 14;
        private boolean isCenterSystemLast5EveryMinutes_;
        public static final int END_TIME_FIELD_NUMBER = 10;
        private int endTime_;
        private byte memoizedIsInitialized;
        private static final AnnounceData DEFAULT_INSTANCE;
        private static final Parser<AnnounceData> PARSER;
        
        private AnnounceData(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private AnnounceData() {
            this.memoizedIsInitialized = -1;
            this.countDownText_ = "";
            this.centerSystemText_ = "";
            this.dungeonConfirmText_ = "";
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new AnnounceData();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private AnnounceData(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 8: {
                            this.countDownFrequency_ = input.readUInt32();
                            continue;
                        }
                        case 18: {
                            final String s = input.readStringRequireUtf8();
                            this.dungeonConfirmText_ = s;
                            continue;
                        }
                        case 32: {
                            this.beginTime_ = input.readUInt32();
                            continue;
                        }
                        case 56: {
                            this.configId_ = input.readUInt32();
                            continue;
                        }
                        case 66: {
                            final String s = input.readStringRequireUtf8();
                            this.centerSystemText_ = s;
                            continue;
                        }
                        case 74: {
                            final String s = input.readStringRequireUtf8();
                            this.countDownText_ = s;
                            continue;
                        }
                        case 80: {
                            this.endTime_ = input.readUInt32();
                            continue;
                        }
                        case 88: {
                            this.centerSystemFrequency_ = input.readUInt32();
                            continue;
                        }
                        case 112: {
                            this.isCenterSystemLast5EveryMinutes_ = input.readBool();
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
            return AnnounceDataOuterClass.internal_static_AnnounceData_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return AnnounceDataOuterClass.internal_static_AnnounceData_fieldAccessorTable.ensureFieldAccessorsInitialized(AnnounceData.class, Builder.class);
        }
        
        @Override
        public String getCountDownText() {
            final Object ref = this.countDownText_;
            if (ref instanceof String) {
                return (String)ref;
            }
            final ByteString bs = (ByteString)ref;
            final String s = bs.toStringUtf8();
            return (String)(this.countDownText_ = s);
        }
        
        @Override
        public ByteString getCountDownTextBytes() {
            final Object ref = this.countDownText_;
            if (ref instanceof String) {
                final ByteString b = ByteString.copyFromUtf8((String)ref);
                return (ByteString)(this.countDownText_ = b);
            }
            return (ByteString)ref;
        }
        
        @Override
        public String getCenterSystemText() {
            final Object ref = this.centerSystemText_;
            if (ref instanceof String) {
                return (String)ref;
            }
            final ByteString bs = (ByteString)ref;
            final String s = bs.toStringUtf8();
            return (String)(this.centerSystemText_ = s);
        }
        
        @Override
        public ByteString getCenterSystemTextBytes() {
            final Object ref = this.centerSystemText_;
            if (ref instanceof String) {
                final ByteString b = ByteString.copyFromUtf8((String)ref);
                return (ByteString)(this.centerSystemText_ = b);
            }
            return (ByteString)ref;
        }
        
        @Override
        public int getCountDownFrequency() {
            return this.countDownFrequency_;
        }
        
        @Override
        public int getConfigId() {
            return this.configId_;
        }
        
        @Override
        public int getBeginTime() {
            return this.beginTime_;
        }
        
        @Override
        public int getCenterSystemFrequency() {
            return this.centerSystemFrequency_;
        }
        
        @Override
        public String getDungeonConfirmText() {
            final Object ref = this.dungeonConfirmText_;
            if (ref instanceof String) {
                return (String)ref;
            }
            final ByteString bs = (ByteString)ref;
            final String s = bs.toStringUtf8();
            return (String)(this.dungeonConfirmText_ = s);
        }
        
        @Override
        public ByteString getDungeonConfirmTextBytes() {
            final Object ref = this.dungeonConfirmText_;
            if (ref instanceof String) {
                final ByteString b = ByteString.copyFromUtf8((String)ref);
                return (ByteString)(this.dungeonConfirmText_ = b);
            }
            return (ByteString)ref;
        }
        
        @Override
        public boolean getIsCenterSystemLast5EveryMinutes() {
            return this.isCenterSystemLast5EveryMinutes_;
        }
        
        @Override
        public int getEndTime() {
            return this.endTime_;
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
            if (this.countDownFrequency_ != 0) {
                output.writeUInt32(1, this.countDownFrequency_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.dungeonConfirmText_)) {
                GeneratedMessageV3.writeString(output, 2, this.dungeonConfirmText_);
            }
            if (this.beginTime_ != 0) {
                output.writeUInt32(4, this.beginTime_);
            }
            if (this.configId_ != 0) {
                output.writeUInt32(7, this.configId_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.centerSystemText_)) {
                GeneratedMessageV3.writeString(output, 8, this.centerSystemText_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.countDownText_)) {
                GeneratedMessageV3.writeString(output, 9, this.countDownText_);
            }
            if (this.endTime_ != 0) {
                output.writeUInt32(10, this.endTime_);
            }
            if (this.centerSystemFrequency_ != 0) {
                output.writeUInt32(11, this.centerSystemFrequency_);
            }
            if (this.isCenterSystemLast5EveryMinutes_) {
                output.writeBool(14, this.isCenterSystemLast5EveryMinutes_);
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
            if (this.countDownFrequency_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1, this.countDownFrequency_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.dungeonConfirmText_)) {
                size += GeneratedMessageV3.computeStringSize(2, this.dungeonConfirmText_);
            }
            if (this.beginTime_ != 0) {
                size += CodedOutputStream.computeUInt32Size(4, this.beginTime_);
            }
            if (this.configId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(7, this.configId_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.centerSystemText_)) {
                size += GeneratedMessageV3.computeStringSize(8, this.centerSystemText_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.countDownText_)) {
                size += GeneratedMessageV3.computeStringSize(9, this.countDownText_);
            }
            if (this.endTime_ != 0) {
                size += CodedOutputStream.computeUInt32Size(10, this.endTime_);
            }
            if (this.centerSystemFrequency_ != 0) {
                size += CodedOutputStream.computeUInt32Size(11, this.centerSystemFrequency_);
            }
            if (this.isCenterSystemLast5EveryMinutes_) {
                size += CodedOutputStream.computeBoolSize(14, this.isCenterSystemLast5EveryMinutes_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AnnounceData)) {
                return super.equals(obj);
            }
            final AnnounceData other = (AnnounceData)obj;
            return this.getCountDownText().equals(other.getCountDownText()) && this.getCenterSystemText().equals(other.getCenterSystemText()) && this.getCountDownFrequency() == other.getCountDownFrequency() && this.getConfigId() == other.getConfigId() && this.getBeginTime() == other.getBeginTime() && this.getCenterSystemFrequency() == other.getCenterSystemFrequency() && this.getDungeonConfirmText().equals(other.getDungeonConfirmText()) && this.getIsCenterSystemLast5EveryMinutes() == other.getIsCenterSystemLast5EveryMinutes() && this.getEndTime() == other.getEndTime() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 9;
            hash = 53 * hash + this.getCountDownText().hashCode();
            hash = 37 * hash + 8;
            hash = 53 * hash + this.getCenterSystemText().hashCode();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getCountDownFrequency();
            hash = 37 * hash + 7;
            hash = 53 * hash + this.getConfigId();
            hash = 37 * hash + 4;
            hash = 53 * hash + this.getBeginTime();
            hash = 37 * hash + 11;
            hash = 53 * hash + this.getCenterSystemFrequency();
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getDungeonConfirmText().hashCode();
            hash = 37 * hash + 14;
            hash = 53 * hash + Internal.hashBoolean(this.getIsCenterSystemLast5EveryMinutes());
            hash = 37 * hash + 10;
            hash = 53 * hash + this.getEndTime();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static AnnounceData parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return AnnounceData.PARSER.parseFrom(data);
        }
        
        public static AnnounceData parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AnnounceData.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AnnounceData parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return AnnounceData.PARSER.parseFrom(data);
        }
        
        public static AnnounceData parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AnnounceData.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AnnounceData parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return AnnounceData.PARSER.parseFrom(data);
        }
        
        public static AnnounceData parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AnnounceData.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AnnounceData parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AnnounceData.PARSER, input);
        }
        
        public static AnnounceData parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AnnounceData.PARSER, input, extensionRegistry);
        }
        
        public static AnnounceData parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AnnounceData.PARSER, input);
        }
        
        public static AnnounceData parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AnnounceData.PARSER, input, extensionRegistry);
        }
        
        public static AnnounceData parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AnnounceData.PARSER, input);
        }
        
        public static AnnounceData parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AnnounceData.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return AnnounceData.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final AnnounceData prototype) {
            return AnnounceData.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == AnnounceData.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static AnnounceData getDefaultInstance() {
            return AnnounceData.DEFAULT_INSTANCE;
        }
        
        public static Parser<AnnounceData> parser() {
            return AnnounceData.PARSER;
        }
        
        @Override
        public Parser<AnnounceData> getParserForType() {
            return AnnounceData.PARSER;
        }
        
        @Override
        public AnnounceData getDefaultInstanceForType() {
            return AnnounceData.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new AnnounceData();
            PARSER = new AbstractParser<AnnounceData>() {
                @Override
                public AnnounceData parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new AnnounceData(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AnnounceDataOrBuilder
        {
            private Object countDownText_;
            private Object centerSystemText_;
            private int countDownFrequency_;
            private int configId_;
            private int beginTime_;
            private int centerSystemFrequency_;
            private Object dungeonConfirmText_;
            private boolean isCenterSystemLast5EveryMinutes_;
            private int endTime_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return AnnounceDataOuterClass.internal_static_AnnounceData_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return AnnounceDataOuterClass.internal_static_AnnounceData_fieldAccessorTable.ensureFieldAccessorsInitialized(AnnounceData.class, Builder.class);
            }
            
            private Builder() {
                this.countDownText_ = "";
                this.centerSystemText_ = "";
                this.dungeonConfirmText_ = "";
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.countDownText_ = "";
                this.centerSystemText_ = "";
                this.dungeonConfirmText_ = "";
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (AnnounceData.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.countDownText_ = "";
                this.centerSystemText_ = "";
                this.countDownFrequency_ = 0;
                this.configId_ = 0;
                this.beginTime_ = 0;
                this.centerSystemFrequency_ = 0;
                this.dungeonConfirmText_ = "";
                this.isCenterSystemLast5EveryMinutes_ = false;
                this.endTime_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return AnnounceDataOuterClass.internal_static_AnnounceData_descriptor;
            }
            
            @Override
            public AnnounceData getDefaultInstanceForType() {
                return AnnounceData.getDefaultInstance();
            }
            
            @Override
            public AnnounceData build() {
                final AnnounceData result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public AnnounceData buildPartial() {
                final AnnounceData result = new AnnounceData(this);
                result.countDownText_ = this.countDownText_;
                result.centerSystemText_ = this.centerSystemText_;
                result.countDownFrequency_ = this.countDownFrequency_;
                result.configId_ = this.configId_;
                result.beginTime_ = this.beginTime_;
                result.centerSystemFrequency_ = this.centerSystemFrequency_;
                result.dungeonConfirmText_ = this.dungeonConfirmText_;
                result.isCenterSystemLast5EveryMinutes_ = this.isCenterSystemLast5EveryMinutes_;
                result.endTime_ = this.endTime_;
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
                if (other instanceof AnnounceData) {
                    return this.mergeFrom((AnnounceData)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final AnnounceData other) {
                if (other == AnnounceData.getDefaultInstance()) {
                    return this;
                }
                if (!other.getCountDownText().isEmpty()) {
                    this.countDownText_ = other.countDownText_;
                    this.onChanged();
                }
                if (!other.getCenterSystemText().isEmpty()) {
                    this.centerSystemText_ = other.centerSystemText_;
                    this.onChanged();
                }
                if (other.getCountDownFrequency() != 0) {
                    this.setCountDownFrequency(other.getCountDownFrequency());
                }
                if (other.getConfigId() != 0) {
                    this.setConfigId(other.getConfigId());
                }
                if (other.getBeginTime() != 0) {
                    this.setBeginTime(other.getBeginTime());
                }
                if (other.getCenterSystemFrequency() != 0) {
                    this.setCenterSystemFrequency(other.getCenterSystemFrequency());
                }
                if (!other.getDungeonConfirmText().isEmpty()) {
                    this.dungeonConfirmText_ = other.dungeonConfirmText_;
                    this.onChanged();
                }
                if (other.getIsCenterSystemLast5EveryMinutes()) {
                    this.setIsCenterSystemLast5EveryMinutes(other.getIsCenterSystemLast5EveryMinutes());
                }
                if (other.getEndTime() != 0) {
                    this.setEndTime(other.getEndTime());
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
                AnnounceData parsedMessage = null;
                try {
                    parsedMessage = AnnounceData.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (AnnounceData)e.getUnfinishedMessage();
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
            public String getCountDownText() {
                final Object ref = this.countDownText_;
                if (!(ref instanceof String)) {
                    final ByteString bs = (ByteString)ref;
                    final String s = bs.toStringUtf8();
                    return (String)(this.countDownText_ = s);
                }
                return (String)ref;
            }
            
            @Override
            public ByteString getCountDownTextBytes() {
                final Object ref = this.countDownText_;
                if (ref instanceof String) {
                    final ByteString b = ByteString.copyFromUtf8((String)ref);
                    return (ByteString)(this.countDownText_ = b);
                }
                return (ByteString)ref;
            }
            
            public Builder setCountDownText(final String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.countDownText_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearCountDownText() {
                this.countDownText_ = AnnounceData.getDefaultInstance().getCountDownText();
                this.onChanged();
                return this;
            }
            
            public Builder setCountDownTextBytes(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                AbstractMessageLite.checkByteStringIsUtf8(value);
                this.countDownText_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public String getCenterSystemText() {
                final Object ref = this.centerSystemText_;
                if (!(ref instanceof String)) {
                    final ByteString bs = (ByteString)ref;
                    final String s = bs.toStringUtf8();
                    return (String)(this.centerSystemText_ = s);
                }
                return (String)ref;
            }
            
            @Override
            public ByteString getCenterSystemTextBytes() {
                final Object ref = this.centerSystemText_;
                if (ref instanceof String) {
                    final ByteString b = ByteString.copyFromUtf8((String)ref);
                    return (ByteString)(this.centerSystemText_ = b);
                }
                return (ByteString)ref;
            }
            
            public Builder setCenterSystemText(final String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.centerSystemText_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearCenterSystemText() {
                this.centerSystemText_ = AnnounceData.getDefaultInstance().getCenterSystemText();
                this.onChanged();
                return this;
            }
            
            public Builder setCenterSystemTextBytes(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                AbstractMessageLite.checkByteStringIsUtf8(value);
                this.centerSystemText_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getCountDownFrequency() {
                return this.countDownFrequency_;
            }
            
            public Builder setCountDownFrequency(final int value) {
                this.countDownFrequency_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearCountDownFrequency() {
                this.countDownFrequency_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getConfigId() {
                return this.configId_;
            }
            
            public Builder setConfigId(final int value) {
                this.configId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearConfigId() {
                this.configId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getBeginTime() {
                return this.beginTime_;
            }
            
            public Builder setBeginTime(final int value) {
                this.beginTime_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearBeginTime() {
                this.beginTime_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getCenterSystemFrequency() {
                return this.centerSystemFrequency_;
            }
            
            public Builder setCenterSystemFrequency(final int value) {
                this.centerSystemFrequency_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearCenterSystemFrequency() {
                this.centerSystemFrequency_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public String getDungeonConfirmText() {
                final Object ref = this.dungeonConfirmText_;
                if (!(ref instanceof String)) {
                    final ByteString bs = (ByteString)ref;
                    final String s = bs.toStringUtf8();
                    return (String)(this.dungeonConfirmText_ = s);
                }
                return (String)ref;
            }
            
            @Override
            public ByteString getDungeonConfirmTextBytes() {
                final Object ref = this.dungeonConfirmText_;
                if (ref instanceof String) {
                    final ByteString b = ByteString.copyFromUtf8((String)ref);
                    return (ByteString)(this.dungeonConfirmText_ = b);
                }
                return (ByteString)ref;
            }
            
            public Builder setDungeonConfirmText(final String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.dungeonConfirmText_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearDungeonConfirmText() {
                this.dungeonConfirmText_ = AnnounceData.getDefaultInstance().getDungeonConfirmText();
                this.onChanged();
                return this;
            }
            
            public Builder setDungeonConfirmTextBytes(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                AbstractMessageLite.checkByteStringIsUtf8(value);
                this.dungeonConfirmText_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean getIsCenterSystemLast5EveryMinutes() {
                return this.isCenterSystemLast5EveryMinutes_;
            }
            
            public Builder setIsCenterSystemLast5EveryMinutes(final boolean value) {
                this.isCenterSystemLast5EveryMinutes_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIsCenterSystemLast5EveryMinutes() {
                this.isCenterSystemLast5EveryMinutes_ = false;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getEndTime() {
                return this.endTime_;
            }
            
            public Builder setEndTime(final int value) {
                this.endTime_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearEndTime() {
                this.endTime_ = 0;
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
    
    public interface AnnounceDataOrBuilder extends MessageOrBuilder
    {
        String getCountDownText();
        
        ByteString getCountDownTextBytes();
        
        String getCenterSystemText();
        
        ByteString getCenterSystemTextBytes();
        
        int getCountDownFrequency();
        
        int getConfigId();
        
        int getBeginTime();
        
        int getCenterSystemFrequency();
        
        String getDungeonConfirmText();
        
        ByteString getDungeonConfirmTextBytes();
        
        boolean getIsCenterSystemLast5EveryMinutes();
        
        int getEndTime();
    }
}
