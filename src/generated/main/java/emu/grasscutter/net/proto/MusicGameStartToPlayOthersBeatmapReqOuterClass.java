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

public final class MusicGameStartToPlayOthersBeatmapReqOuterClass
{
    private static final Descriptors.Descriptor internal_static_MusicGameStartToPlayOthersBeatmapReq_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_MusicGameStartToPlayOthersBeatmapReq_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private MusicGameStartToPlayOthersBeatmapReqOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return MusicGameStartToPlayOthersBeatmapReqOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n*MusicGameStartToPlayOthersBeatmapReq.proto\u001a\u001bMusicGameUnknown1Enum.proto\"U\n$MusicGameStartToPlayOthersBeatmapReq\u0012-\n\runknown_enum1\u0018\f \u0001(\u000e2\u0016.MusicGameUnknown1EnumB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        MusicGameStartToPlayOthersBeatmapReqOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { MusicGameUnknown1EnumOuterClass.getDescriptor() });
        internal_static_MusicGameStartToPlayOthersBeatmapReq_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_MusicGameStartToPlayOthersBeatmapReq_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(MusicGameStartToPlayOthersBeatmapReqOuterClass.internal_static_MusicGameStartToPlayOthersBeatmapReq_descriptor, new String[] { "UnknownEnum1" });
        MusicGameUnknown1EnumOuterClass.getDescriptor();
    }
    
    public static final class MusicGameStartToPlayOthersBeatmapReq extends GeneratedMessageV3 implements MusicGameStartToPlayOthersBeatmapReqOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int UNKNOWN_ENUM1_FIELD_NUMBER = 12;
        private int unknownEnum1_;
        private byte memoizedIsInitialized;
        private static final MusicGameStartToPlayOthersBeatmapReq DEFAULT_INSTANCE;
        private static final Parser<MusicGameStartToPlayOthersBeatmapReq> PARSER;
        
        private MusicGameStartToPlayOthersBeatmapReq(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private MusicGameStartToPlayOthersBeatmapReq() {
            this.memoizedIsInitialized = -1;
            this.unknownEnum1_ = 0;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new MusicGameStartToPlayOthersBeatmapReq();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private MusicGameStartToPlayOthersBeatmapReq(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
            return MusicGameStartToPlayOthersBeatmapReqOuterClass.internal_static_MusicGameStartToPlayOthersBeatmapReq_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return MusicGameStartToPlayOthersBeatmapReqOuterClass.internal_static_MusicGameStartToPlayOthersBeatmapReq_fieldAccessorTable.ensureFieldAccessorsInitialized(MusicGameStartToPlayOthersBeatmapReq.class, Builder.class);
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
            if (!(obj instanceof MusicGameStartToPlayOthersBeatmapReq)) {
                return super.equals(obj);
            }
            final MusicGameStartToPlayOthersBeatmapReq other = (MusicGameStartToPlayOthersBeatmapReq)obj;
            return this.unknownEnum1_ == other.unknownEnum1_ && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 12;
            hash = 53 * hash + this.unknownEnum1_;
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static MusicGameStartToPlayOthersBeatmapReq parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return MusicGameStartToPlayOthersBeatmapReq.PARSER.parseFrom(data);
        }
        
        public static MusicGameStartToPlayOthersBeatmapReq parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return MusicGameStartToPlayOthersBeatmapReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static MusicGameStartToPlayOthersBeatmapReq parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return MusicGameStartToPlayOthersBeatmapReq.PARSER.parseFrom(data);
        }
        
        public static MusicGameStartToPlayOthersBeatmapReq parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return MusicGameStartToPlayOthersBeatmapReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static MusicGameStartToPlayOthersBeatmapReq parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return MusicGameStartToPlayOthersBeatmapReq.PARSER.parseFrom(data);
        }
        
        public static MusicGameStartToPlayOthersBeatmapReq parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return MusicGameStartToPlayOthersBeatmapReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static MusicGameStartToPlayOthersBeatmapReq parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MusicGameStartToPlayOthersBeatmapReq.PARSER, input);
        }
        
        public static MusicGameStartToPlayOthersBeatmapReq parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MusicGameStartToPlayOthersBeatmapReq.PARSER, input, extensionRegistry);
        }
        
        public static MusicGameStartToPlayOthersBeatmapReq parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(MusicGameStartToPlayOthersBeatmapReq.PARSER, input);
        }
        
        public static MusicGameStartToPlayOthersBeatmapReq parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(MusicGameStartToPlayOthersBeatmapReq.PARSER, input, extensionRegistry);
        }
        
        public static MusicGameStartToPlayOthersBeatmapReq parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MusicGameStartToPlayOthersBeatmapReq.PARSER, input);
        }
        
        public static MusicGameStartToPlayOthersBeatmapReq parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MusicGameStartToPlayOthersBeatmapReq.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return MusicGameStartToPlayOthersBeatmapReq.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final MusicGameStartToPlayOthersBeatmapReq prototype) {
            return MusicGameStartToPlayOthersBeatmapReq.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == MusicGameStartToPlayOthersBeatmapReq.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static MusicGameStartToPlayOthersBeatmapReq getDefaultInstance() {
            return MusicGameStartToPlayOthersBeatmapReq.DEFAULT_INSTANCE;
        }
        
        public static Parser<MusicGameStartToPlayOthersBeatmapReq> parser() {
            return MusicGameStartToPlayOthersBeatmapReq.PARSER;
        }
        
        @Override
        public Parser<MusicGameStartToPlayOthersBeatmapReq> getParserForType() {
            return MusicGameStartToPlayOthersBeatmapReq.PARSER;
        }
        
        @Override
        public MusicGameStartToPlayOthersBeatmapReq getDefaultInstanceForType() {
            return MusicGameStartToPlayOthersBeatmapReq.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new MusicGameStartToPlayOthersBeatmapReq();
            PARSER = new AbstractParser<MusicGameStartToPlayOthersBeatmapReq>() {
                @Override
                public MusicGameStartToPlayOthersBeatmapReq parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new MusicGameStartToPlayOthersBeatmapReq(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements MusicGameStartToPlayOthersBeatmapReqOrBuilder
        {
            private int unknownEnum1_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return MusicGameStartToPlayOthersBeatmapReqOuterClass.internal_static_MusicGameStartToPlayOthersBeatmapReq_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return MusicGameStartToPlayOthersBeatmapReqOuterClass.internal_static_MusicGameStartToPlayOthersBeatmapReq_fieldAccessorTable.ensureFieldAccessorsInitialized(MusicGameStartToPlayOthersBeatmapReq.class, Builder.class);
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
                if (MusicGameStartToPlayOthersBeatmapReq.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.unknownEnum1_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return MusicGameStartToPlayOthersBeatmapReqOuterClass.internal_static_MusicGameStartToPlayOthersBeatmapReq_descriptor;
            }
            
            @Override
            public MusicGameStartToPlayOthersBeatmapReq getDefaultInstanceForType() {
                return MusicGameStartToPlayOthersBeatmapReq.getDefaultInstance();
            }
            
            @Override
            public MusicGameStartToPlayOthersBeatmapReq build() {
                final MusicGameStartToPlayOthersBeatmapReq result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public MusicGameStartToPlayOthersBeatmapReq buildPartial() {
                final MusicGameStartToPlayOthersBeatmapReq result = new MusicGameStartToPlayOthersBeatmapReq(this);
                result.unknownEnum1_ = this.unknownEnum1_;
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
                if (other instanceof MusicGameStartToPlayOthersBeatmapReq) {
                    return this.mergeFrom((MusicGameStartToPlayOthersBeatmapReq)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final MusicGameStartToPlayOthersBeatmapReq other) {
                if (other == MusicGameStartToPlayOthersBeatmapReq.getDefaultInstance()) {
                    return this;
                }
                if (other.unknownEnum1_ != 0) {
                    this.setUnknownEnum1Value(other.getUnknownEnum1Value());
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
                MusicGameStartToPlayOthersBeatmapReq parsedMessage = null;
                try {
                    parsedMessage = MusicGameStartToPlayOthersBeatmapReq.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (MusicGameStartToPlayOthersBeatmapReq)e.getUnfinishedMessage();
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
            public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }
            
            @Override
            public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }
        }
    }
    
    public interface MusicGameStartToPlayOthersBeatmapReqOrBuilder extends MessageOrBuilder
    {
        int getUnknownEnum1Value();
        
        MusicGameUnknown1EnumOuterClass.MusicGameUnknown1Enum getUnknownEnum1();
    }
}
