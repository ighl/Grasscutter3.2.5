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

public final class MusicGameCreateBeatmapRspOuterClass
{
    private static final Descriptors.Descriptor internal_static_MusicGameCreateBeatmapRsp_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_MusicGameCreateBeatmapRsp_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private MusicGameCreateBeatmapRspOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return MusicGameCreateBeatmapRspOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001fMusicGameCreateBeatmapRsp.proto\u001a\u001bMusicGameUnknown1Enum.proto\"s\n\u0019MusicGameCreateBeatmapRsp\u0012\u000f\n\u0007retcode\u0018\n \u0001(\u0005\u0012-\n\runknown_enum1\u0018\f \u0001(\u000e2\u0016.MusicGameUnknown1Enum\u0012\u0016\n\u000emusic_share_id\u0018\u0005 \u0001(\u0004B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        MusicGameCreateBeatmapRspOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { MusicGameUnknown1EnumOuterClass.getDescriptor() });
        internal_static_MusicGameCreateBeatmapRsp_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_MusicGameCreateBeatmapRsp_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(MusicGameCreateBeatmapRspOuterClass.internal_static_MusicGameCreateBeatmapRsp_descriptor, new String[] { "Retcode", "UnknownEnum1", "MusicShareId" });
        MusicGameUnknown1EnumOuterClass.getDescriptor();
    }
    
    public static final class MusicGameCreateBeatmapRsp extends GeneratedMessageV3 implements MusicGameCreateBeatmapRspOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int RETCODE_FIELD_NUMBER = 10;
        private int retcode_;
        public static final int UNKNOWN_ENUM1_FIELD_NUMBER = 12;
        private int unknownEnum1_;
        public static final int MUSIC_SHARE_ID_FIELD_NUMBER = 5;
        private long musicShareId_;
        private byte memoizedIsInitialized;
        private static final MusicGameCreateBeatmapRsp DEFAULT_INSTANCE;
        private static final Parser<MusicGameCreateBeatmapRsp> PARSER;
        
        private MusicGameCreateBeatmapRsp(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private MusicGameCreateBeatmapRsp() {
            this.memoizedIsInitialized = -1;
            this.unknownEnum1_ = 0;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new MusicGameCreateBeatmapRsp();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private MusicGameCreateBeatmapRsp(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 40: {
                            this.musicShareId_ = input.readUInt64();
                            continue;
                        }
                        case 80: {
                            this.retcode_ = input.readInt32();
                            continue;
                        }
                        case 96: {
                            final int rawValue = input.readEnum();
                            this.unknownEnum1_ = rawValue;
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
            return MusicGameCreateBeatmapRspOuterClass.internal_static_MusicGameCreateBeatmapRsp_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return MusicGameCreateBeatmapRspOuterClass.internal_static_MusicGameCreateBeatmapRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(MusicGameCreateBeatmapRsp.class, Builder.class);
        }
        
        @Override
        public int getRetcode() {
            return this.retcode_;
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
            if (this.musicShareId_ != 0L) {
                output.writeUInt64(5, this.musicShareId_);
            }
            if (this.retcode_ != 0) {
                output.writeInt32(10, this.retcode_);
            }
            if (this.unknownEnum1_ != MusicGameUnknown1EnumOuterClass.MusicGameUnknown1Enum.MusicGameUnknown1Enum_NONE.getNumber()) {
                output.writeEnum(12, this.unknownEnum1_);
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
            if (this.musicShareId_ != 0L) {
                size += CodedOutputStream.computeUInt64Size(5, this.musicShareId_);
            }
            if (this.retcode_ != 0) {
                size += CodedOutputStream.computeInt32Size(10, this.retcode_);
            }
            if (this.unknownEnum1_ != MusicGameUnknown1EnumOuterClass.MusicGameUnknown1Enum.MusicGameUnknown1Enum_NONE.getNumber()) {
                size += CodedOutputStream.computeEnumSize(12, this.unknownEnum1_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MusicGameCreateBeatmapRsp)) {
                return super.equals(obj);
            }
            final MusicGameCreateBeatmapRsp other = (MusicGameCreateBeatmapRsp)obj;
            return this.getRetcode() == other.getRetcode() && this.unknownEnum1_ == other.unknownEnum1_ && this.getMusicShareId() == other.getMusicShareId() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 10;
            hash = 53 * hash + this.getRetcode();
            hash = 37 * hash + 12;
            hash = 53 * hash + this.unknownEnum1_;
            hash = 37 * hash + 5;
            hash = 53 * hash + Internal.hashLong(this.getMusicShareId());
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static MusicGameCreateBeatmapRsp parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return MusicGameCreateBeatmapRsp.PARSER.parseFrom(data);
        }
        
        public static MusicGameCreateBeatmapRsp parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return MusicGameCreateBeatmapRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static MusicGameCreateBeatmapRsp parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return MusicGameCreateBeatmapRsp.PARSER.parseFrom(data);
        }
        
        public static MusicGameCreateBeatmapRsp parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return MusicGameCreateBeatmapRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static MusicGameCreateBeatmapRsp parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return MusicGameCreateBeatmapRsp.PARSER.parseFrom(data);
        }
        
        public static MusicGameCreateBeatmapRsp parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return MusicGameCreateBeatmapRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static MusicGameCreateBeatmapRsp parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MusicGameCreateBeatmapRsp.PARSER, input);
        }
        
        public static MusicGameCreateBeatmapRsp parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MusicGameCreateBeatmapRsp.PARSER, input, extensionRegistry);
        }
        
        public static MusicGameCreateBeatmapRsp parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(MusicGameCreateBeatmapRsp.PARSER, input);
        }
        
        public static MusicGameCreateBeatmapRsp parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(MusicGameCreateBeatmapRsp.PARSER, input, extensionRegistry);
        }
        
        public static MusicGameCreateBeatmapRsp parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MusicGameCreateBeatmapRsp.PARSER, input);
        }
        
        public static MusicGameCreateBeatmapRsp parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MusicGameCreateBeatmapRsp.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return MusicGameCreateBeatmapRsp.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final MusicGameCreateBeatmapRsp prototype) {
            return MusicGameCreateBeatmapRsp.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == MusicGameCreateBeatmapRsp.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static MusicGameCreateBeatmapRsp getDefaultInstance() {
            return MusicGameCreateBeatmapRsp.DEFAULT_INSTANCE;
        }
        
        public static Parser<MusicGameCreateBeatmapRsp> parser() {
            return MusicGameCreateBeatmapRsp.PARSER;
        }
        
        @Override
        public Parser<MusicGameCreateBeatmapRsp> getParserForType() {
            return MusicGameCreateBeatmapRsp.PARSER;
        }
        
        @Override
        public MusicGameCreateBeatmapRsp getDefaultInstanceForType() {
            return MusicGameCreateBeatmapRsp.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new MusicGameCreateBeatmapRsp();
            PARSER = new AbstractParser<MusicGameCreateBeatmapRsp>() {
                @Override
                public MusicGameCreateBeatmapRsp parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new MusicGameCreateBeatmapRsp(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements MusicGameCreateBeatmapRspOrBuilder
        {
            private int retcode_;
            private int unknownEnum1_;
            private long musicShareId_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return MusicGameCreateBeatmapRspOuterClass.internal_static_MusicGameCreateBeatmapRsp_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return MusicGameCreateBeatmapRspOuterClass.internal_static_MusicGameCreateBeatmapRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(MusicGameCreateBeatmapRsp.class, Builder.class);
            }
            
            private Builder() {
                this.unknownEnum1_ = 0;
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.unknownEnum1_ = 0;
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (MusicGameCreateBeatmapRsp.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.retcode_ = 0;
                this.unknownEnum1_ = 0;
                this.musicShareId_ = 0L;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return MusicGameCreateBeatmapRspOuterClass.internal_static_MusicGameCreateBeatmapRsp_descriptor;
            }
            
            @Override
            public MusicGameCreateBeatmapRsp getDefaultInstanceForType() {
                return MusicGameCreateBeatmapRsp.getDefaultInstance();
            }
            
            @Override
            public MusicGameCreateBeatmapRsp build() {
                final MusicGameCreateBeatmapRsp result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public MusicGameCreateBeatmapRsp buildPartial() {
                final MusicGameCreateBeatmapRsp result = new MusicGameCreateBeatmapRsp(this);
                result.retcode_ = this.retcode_;
                result.unknownEnum1_ = this.unknownEnum1_;
                result.musicShareId_ = this.musicShareId_;
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
                if (other instanceof MusicGameCreateBeatmapRsp) {
                    return this.mergeFrom((MusicGameCreateBeatmapRsp)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final MusicGameCreateBeatmapRsp other) {
                if (other == MusicGameCreateBeatmapRsp.getDefaultInstance()) {
                    return this;
                }
                if (other.getRetcode() != 0) {
                    this.setRetcode(other.getRetcode());
                }
                if (other.unknownEnum1_ != 0) {
                    this.setUnknownEnum1Value(other.getUnknownEnum1Value());
                }
                if (other.getMusicShareId() != 0L) {
                    this.setMusicShareId(other.getMusicShareId());
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
                MusicGameCreateBeatmapRsp parsedMessage = null;
                try {
                    parsedMessage = MusicGameCreateBeatmapRsp.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (MusicGameCreateBeatmapRsp)e.getUnfinishedMessage();
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
            public int getRetcode() {
                return this.retcode_;
            }
            
            public Builder setRetcode(final int value) {
                this.retcode_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearRetcode() {
                this.retcode_ = 0;
                this.onChanged();
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
            public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }
            
            @Override
            public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }
        }
    }
    
    public interface MusicGameCreateBeatmapRspOrBuilder extends MessageOrBuilder
    {
        int getRetcode();
        
        int getUnknownEnum1Value();
        
        MusicGameUnknown1EnumOuterClass.MusicGameUnknown1Enum getUnknownEnum1();
        
        long getMusicShareId();
    }
}
