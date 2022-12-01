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

public final class MusicGameGetBeatmapReqOuterClass
{
    private static final Descriptors.Descriptor internal_static_MusicGameGetBeatmapReq_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_MusicGameGetBeatmapReq_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private MusicGameGetBeatmapReqOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return MusicGameGetBeatmapReqOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001cMusicGameGetBeatmapReq.proto\u001a\u001bMusicGameUnknown2Enum.proto\u001a MusicGameGetBeatmapReqType.proto\u001a\u001bMusicGameUnknown1Enum.proto\"\u00d2\u0001\n\u0016MusicGameGetBeatmapReq\u0012-\n\runknown_enum1\u0018\u0001 \u0001(\u000e2\u0016.MusicGameUnknown1Enum\u0012\u0016\n\u000emusic_share_id\u0018\n \u0001(\u0004\u0012-\n\runknown_enum2\u0018\f \u0001(\u000e2\u0016.MusicGameUnknown2Enum\u0012\u0013\n\u000bCDFOGGDLKNA\u0018\u000f \u0001(\b\u0012-\n\breq_type\u0018\u000b \u0001(\u000e2\u001b.MusicGameGetBeatmapReqTypeB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        MusicGameGetBeatmapReqOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { MusicGameUnknown2EnumOuterClass.getDescriptor(), MusicGameGetBeatmapReqTypeOuterClass.getDescriptor(), MusicGameUnknown1EnumOuterClass.getDescriptor() });
        internal_static_MusicGameGetBeatmapReq_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_MusicGameGetBeatmapReq_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(MusicGameGetBeatmapReqOuterClass.internal_static_MusicGameGetBeatmapReq_descriptor, new String[] { "UnknownEnum1", "MusicShareId", "UnknownEnum2", "CDFOGGDLKNA", "ReqType" });
        MusicGameUnknown2EnumOuterClass.getDescriptor();
        MusicGameGetBeatmapReqTypeOuterClass.getDescriptor();
        MusicGameUnknown1EnumOuterClass.getDescriptor();
    }
    
    public static final class MusicGameGetBeatmapReq extends GeneratedMessageV3 implements MusicGameGetBeatmapReqOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int UNKNOWN_ENUM1_FIELD_NUMBER = 1;
        private int unknownEnum1_;
        public static final int MUSIC_SHARE_ID_FIELD_NUMBER = 10;
        private long musicShareId_;
        public static final int UNKNOWN_ENUM2_FIELD_NUMBER = 12;
        private int unknownEnum2_;
        public static final int CDFOGGDLKNA_FIELD_NUMBER = 15;
        private boolean cDFOGGDLKNA_;
        public static final int REQ_TYPE_FIELD_NUMBER = 11;
        private int reqType_;
        private byte memoizedIsInitialized;
        private static final MusicGameGetBeatmapReq DEFAULT_INSTANCE;
        private static final Parser<MusicGameGetBeatmapReq> PARSER;
        
        private MusicGameGetBeatmapReq(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private MusicGameGetBeatmapReq() {
            this.memoizedIsInitialized = -1;
            this.unknownEnum1_ = 0;
            this.unknownEnum2_ = 0;
            this.reqType_ = 0;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new MusicGameGetBeatmapReq();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private MusicGameGetBeatmapReq(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            final int rawValue = input.readEnum();
                            this.unknownEnum1_ = rawValue;
                            continue;
                        }
                        case 80: {
                            this.musicShareId_ = input.readUInt64();
                            continue;
                        }
                        case 88: {
                            final int rawValue = input.readEnum();
                            this.reqType_ = rawValue;
                            continue;
                        }
                        case 96: {
                            final int rawValue = input.readEnum();
                            this.unknownEnum2_ = rawValue;
                            continue;
                        }
                        case 120: {
                            this.cDFOGGDLKNA_ = input.readBool();
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
            return MusicGameGetBeatmapReqOuterClass.internal_static_MusicGameGetBeatmapReq_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return MusicGameGetBeatmapReqOuterClass.internal_static_MusicGameGetBeatmapReq_fieldAccessorTable.ensureFieldAccessorsInitialized(MusicGameGetBeatmapReq.class, Builder.class);
        }
        
        @Override
        public int getUnknownEnum1Value() {
            return this.unknownEnum1_;
        }
        
        @Override
        public MusicGameUnknown1EnumOuterClass.MusicGameUnknown1Enum getUnknownEnum1() {
            final MusicGameUnknown1EnumOuterClass.MusicGameUnknown1Enum result = MusicGameUnknown1EnumOuterClass.MusicGameUnknown1Enum.valueOf(this.unknownEnum1_);
            return (result == null) ? MusicGameUnknown1EnumOuterClass.MusicGameUnknown1Enum.UNRECOGNIZED : result;
        }
        
        @Override
        public long getMusicShareId() {
            return this.musicShareId_;
        }
        
        @Override
        public int getUnknownEnum2Value() {
            return this.unknownEnum2_;
        }
        
        @Override
        public MusicGameUnknown2EnumOuterClass.MusicGameUnknown2Enum getUnknownEnum2() {
            final MusicGameUnknown2EnumOuterClass.MusicGameUnknown2Enum result = MusicGameUnknown2EnumOuterClass.MusicGameUnknown2Enum.valueOf(this.unknownEnum2_);
            return (result == null) ? MusicGameUnknown2EnumOuterClass.MusicGameUnknown2Enum.UNRECOGNIZED : result;
        }
        
        @Override
        public boolean getCDFOGGDLKNA() {
            return this.cDFOGGDLKNA_;
        }
        
        @Override
        public int getReqTypeValue() {
            return this.reqType_;
        }
        
        @Override
        public MusicGameGetBeatmapReqTypeOuterClass.MusicGameGetBeatmapReqType getReqType() {
            final MusicGameGetBeatmapReqTypeOuterClass.MusicGameGetBeatmapReqType result = MusicGameGetBeatmapReqTypeOuterClass.MusicGameGetBeatmapReqType.valueOf(this.reqType_);
            return (result == null) ? MusicGameGetBeatmapReqTypeOuterClass.MusicGameGetBeatmapReqType.UNRECOGNIZED : result;
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
            if (this.unknownEnum1_ != MusicGameUnknown1EnumOuterClass.MusicGameUnknown1Enum.MusicGameUnknown1Enum_NONE.getNumber()) {
                output.writeEnum(1, this.unknownEnum1_);
            }
            if (this.musicShareId_ != 0L) {
                output.writeUInt64(10, this.musicShareId_);
            }
            if (this.reqType_ != MusicGameGetBeatmapReqTypeOuterClass.MusicGameGetBeatmapReqType.MusicGameGetBeatmapReqType_u1.getNumber()) {
                output.writeEnum(11, this.reqType_);
            }
            if (this.unknownEnum2_ != MusicGameUnknown2EnumOuterClass.MusicGameUnknown2Enum.MusicGameUnknown2Enum_u1.getNumber()) {
                output.writeEnum(12, this.unknownEnum2_);
            }
            if (this.cDFOGGDLKNA_) {
                output.writeBool(15, this.cDFOGGDLKNA_);
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
            if (this.unknownEnum1_ != MusicGameUnknown1EnumOuterClass.MusicGameUnknown1Enum.MusicGameUnknown1Enum_NONE.getNumber()) {
                size += CodedOutputStream.computeEnumSize(1, this.unknownEnum1_);
            }
            if (this.musicShareId_ != 0L) {
                size += CodedOutputStream.computeUInt64Size(10, this.musicShareId_);
            }
            if (this.reqType_ != MusicGameGetBeatmapReqTypeOuterClass.MusicGameGetBeatmapReqType.MusicGameGetBeatmapReqType_u1.getNumber()) {
                size += CodedOutputStream.computeEnumSize(11, this.reqType_);
            }
            if (this.unknownEnum2_ != MusicGameUnknown2EnumOuterClass.MusicGameUnknown2Enum.MusicGameUnknown2Enum_u1.getNumber()) {
                size += CodedOutputStream.computeEnumSize(12, this.unknownEnum2_);
            }
            if (this.cDFOGGDLKNA_) {
                size += CodedOutputStream.computeBoolSize(15, this.cDFOGGDLKNA_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MusicGameGetBeatmapReq)) {
                return super.equals(obj);
            }
            final MusicGameGetBeatmapReq other = (MusicGameGetBeatmapReq)obj;
            return this.unknownEnum1_ == other.unknownEnum1_ && this.getMusicShareId() == other.getMusicShareId() && this.unknownEnum2_ == other.unknownEnum2_ && this.getCDFOGGDLKNA() == other.getCDFOGGDLKNA() && this.reqType_ == other.reqType_ && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.unknownEnum1_;
            hash = 37 * hash + 10;
            hash = 53 * hash + Internal.hashLong(this.getMusicShareId());
            hash = 37 * hash + 12;
            hash = 53 * hash + this.unknownEnum2_;
            hash = 37 * hash + 15;
            hash = 53 * hash + Internal.hashBoolean(this.getCDFOGGDLKNA());
            hash = 37 * hash + 11;
            hash = 53 * hash + this.reqType_;
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static MusicGameGetBeatmapReq parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return MusicGameGetBeatmapReq.PARSER.parseFrom(data);
        }
        
        public static MusicGameGetBeatmapReq parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return MusicGameGetBeatmapReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static MusicGameGetBeatmapReq parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return MusicGameGetBeatmapReq.PARSER.parseFrom(data);
        }
        
        public static MusicGameGetBeatmapReq parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return MusicGameGetBeatmapReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static MusicGameGetBeatmapReq parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return MusicGameGetBeatmapReq.PARSER.parseFrom(data);
        }
        
        public static MusicGameGetBeatmapReq parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return MusicGameGetBeatmapReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static MusicGameGetBeatmapReq parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MusicGameGetBeatmapReq.PARSER, input);
        }
        
        public static MusicGameGetBeatmapReq parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MusicGameGetBeatmapReq.PARSER, input, extensionRegistry);
        }
        
        public static MusicGameGetBeatmapReq parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(MusicGameGetBeatmapReq.PARSER, input);
        }
        
        public static MusicGameGetBeatmapReq parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(MusicGameGetBeatmapReq.PARSER, input, extensionRegistry);
        }
        
        public static MusicGameGetBeatmapReq parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MusicGameGetBeatmapReq.PARSER, input);
        }
        
        public static MusicGameGetBeatmapReq parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MusicGameGetBeatmapReq.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return MusicGameGetBeatmapReq.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final MusicGameGetBeatmapReq prototype) {
            return MusicGameGetBeatmapReq.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == MusicGameGetBeatmapReq.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static MusicGameGetBeatmapReq getDefaultInstance() {
            return MusicGameGetBeatmapReq.DEFAULT_INSTANCE;
        }
        
        public static Parser<MusicGameGetBeatmapReq> parser() {
            return MusicGameGetBeatmapReq.PARSER;
        }
        
        @Override
        public Parser<MusicGameGetBeatmapReq> getParserForType() {
            return MusicGameGetBeatmapReq.PARSER;
        }
        
        @Override
        public MusicGameGetBeatmapReq getDefaultInstanceForType() {
            return MusicGameGetBeatmapReq.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new MusicGameGetBeatmapReq();
            PARSER = new AbstractParser<MusicGameGetBeatmapReq>() {
                @Override
                public MusicGameGetBeatmapReq parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new MusicGameGetBeatmapReq(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements MusicGameGetBeatmapReqOrBuilder
        {
            private int unknownEnum1_;
            private long musicShareId_;
            private int unknownEnum2_;
            private boolean cDFOGGDLKNA_;
            private int reqType_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return MusicGameGetBeatmapReqOuterClass.internal_static_MusicGameGetBeatmapReq_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return MusicGameGetBeatmapReqOuterClass.internal_static_MusicGameGetBeatmapReq_fieldAccessorTable.ensureFieldAccessorsInitialized(MusicGameGetBeatmapReq.class, Builder.class);
            }
            
            private Builder() {
                this.unknownEnum1_ = 0;
                this.unknownEnum2_ = 0;
                this.reqType_ = 0;
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.unknownEnum1_ = 0;
                this.unknownEnum2_ = 0;
                this.reqType_ = 0;
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (MusicGameGetBeatmapReq.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.unknownEnum1_ = 0;
                this.musicShareId_ = 0L;
                this.unknownEnum2_ = 0;
                this.cDFOGGDLKNA_ = false;
                this.reqType_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return MusicGameGetBeatmapReqOuterClass.internal_static_MusicGameGetBeatmapReq_descriptor;
            }
            
            @Override
            public MusicGameGetBeatmapReq getDefaultInstanceForType() {
                return MusicGameGetBeatmapReq.getDefaultInstance();
            }
            
            @Override
            public MusicGameGetBeatmapReq build() {
                final MusicGameGetBeatmapReq result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public MusicGameGetBeatmapReq buildPartial() {
                final MusicGameGetBeatmapReq result = new MusicGameGetBeatmapReq(this);
                result.unknownEnum1_ = this.unknownEnum1_;
                result.musicShareId_ = this.musicShareId_;
                result.unknownEnum2_ = this.unknownEnum2_;
                result.cDFOGGDLKNA_ = this.cDFOGGDLKNA_;
                result.reqType_ = this.reqType_;
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
                if (other instanceof MusicGameGetBeatmapReq) {
                    return this.mergeFrom((MusicGameGetBeatmapReq)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final MusicGameGetBeatmapReq other) {
                if (other == MusicGameGetBeatmapReq.getDefaultInstance()) {
                    return this;
                }
                if (other.unknownEnum1_ != 0) {
                    this.setUnknownEnum1Value(other.getUnknownEnum1Value());
                }
                if (other.getMusicShareId() != 0L) {
                    this.setMusicShareId(other.getMusicShareId());
                }
                if (other.unknownEnum2_ != 0) {
                    this.setUnknownEnum2Value(other.getUnknownEnum2Value());
                }
                if (other.getCDFOGGDLKNA()) {
                    this.setCDFOGGDLKNA(other.getCDFOGGDLKNA());
                }
                if (other.reqType_ != 0) {
                    this.setReqTypeValue(other.getReqTypeValue());
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
                MusicGameGetBeatmapReq parsedMessage = null;
                try {
                    parsedMessage = MusicGameGetBeatmapReq.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (MusicGameGetBeatmapReq)e.getUnfinishedMessage();
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
            public int getUnknownEnum1Value() {
                return this.unknownEnum1_;
            }
            
            public Builder setUnknownEnum1Value(final int value) {
                this.unknownEnum1_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public MusicGameUnknown1EnumOuterClass.MusicGameUnknown1Enum getUnknownEnum1() {
                final MusicGameUnknown1EnumOuterClass.MusicGameUnknown1Enum result = MusicGameUnknown1EnumOuterClass.MusicGameUnknown1Enum.valueOf(this.unknownEnum1_);
                return (result == null) ? MusicGameUnknown1EnumOuterClass.MusicGameUnknown1Enum.UNRECOGNIZED : result;
            }
            
            public Builder setUnknownEnum1(final MusicGameUnknown1EnumOuterClass.MusicGameUnknown1Enum value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.unknownEnum1_ = value.getNumber();
                this.onChanged();
                return this;
            }
            
            public Builder clearUnknownEnum1() {
                this.unknownEnum1_ = 0;
                this.onChanged();
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
            public int getUnknownEnum2Value() {
                return this.unknownEnum2_;
            }
            
            public Builder setUnknownEnum2Value(final int value) {
                this.unknownEnum2_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public MusicGameUnknown2EnumOuterClass.MusicGameUnknown2Enum getUnknownEnum2() {
                final MusicGameUnknown2EnumOuterClass.MusicGameUnknown2Enum result = MusicGameUnknown2EnumOuterClass.MusicGameUnknown2Enum.valueOf(this.unknownEnum2_);
                return (result == null) ? MusicGameUnknown2EnumOuterClass.MusicGameUnknown2Enum.UNRECOGNIZED : result;
            }
            
            public Builder setUnknownEnum2(final MusicGameUnknown2EnumOuterClass.MusicGameUnknown2Enum value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.unknownEnum2_ = value.getNumber();
                this.onChanged();
                return this;
            }
            
            public Builder clearUnknownEnum2() {
                this.unknownEnum2_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean getCDFOGGDLKNA() {
                return this.cDFOGGDLKNA_;
            }
            
            public Builder setCDFOGGDLKNA(final boolean value) {
                this.cDFOGGDLKNA_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearCDFOGGDLKNA() {
                this.cDFOGGDLKNA_ = false;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getReqTypeValue() {
                return this.reqType_;
            }
            
            public Builder setReqTypeValue(final int value) {
                this.reqType_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public MusicGameGetBeatmapReqTypeOuterClass.MusicGameGetBeatmapReqType getReqType() {
                final MusicGameGetBeatmapReqTypeOuterClass.MusicGameGetBeatmapReqType result = MusicGameGetBeatmapReqTypeOuterClass.MusicGameGetBeatmapReqType.valueOf(this.reqType_);
                return (result == null) ? MusicGameGetBeatmapReqTypeOuterClass.MusicGameGetBeatmapReqType.UNRECOGNIZED : result;
            }
            
            public Builder setReqType(final MusicGameGetBeatmapReqTypeOuterClass.MusicGameGetBeatmapReqType value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.reqType_ = value.getNumber();
                this.onChanged();
                return this;
            }
            
            public Builder clearReqType() {
                this.reqType_ = 0;
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
    
    public interface MusicGameGetBeatmapReqOrBuilder extends MessageOrBuilder
    {
        int getUnknownEnum1Value();
        
        MusicGameUnknown1EnumOuterClass.MusicGameUnknown1Enum getUnknownEnum1();
        
        long getMusicShareId();
        
        int getUnknownEnum2Value();
        
        MusicGameUnknown2EnumOuterClass.MusicGameUnknown2Enum getUnknownEnum2();
        
        boolean getCDFOGGDLKNA();
        
        int getReqTypeValue();
        
        MusicGameGetBeatmapReqTypeOuterClass.MusicGameGetBeatmapReqType getReqType();
    }
}
