// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import java.util.Collection;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.Message;
import java.io.InputStream;
import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
import com.google.protobuf.CodedOutputStream;
import java.io.IOException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import java.util.ArrayList;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import java.util.Collections;
import com.google.protobuf.Parser;
import java.util.List;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class Unk3000ENLDIHLGNCK
{
    private static final Descriptors.Descriptor internal_static_Unk3000_ENLDIHLGNCK_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_Unk3000_ENLDIHLGNCK_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private Unk3000ENLDIHLGNCK() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return Unk3000ENLDIHLGNCK.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0019Unk3000_ENLDIHLGNCK.proto\u001a\u0019Unk3000_GDDGGJIFNCH.proto\"e\n\u0013Unk3000_ENLDIHLGNCK\u0012\u001b\n\u0013Unk3000_CIOLEGEHDAC\u0018\u0003 \u0001(\r\u00121\n\u0013Unk3000_NLFPKDOBNCD\u0018\u000f \u0003(\u000b2\u0014.Unk3000_GDDGGJIFNCHB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        Unk3000ENLDIHLGNCK.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { Unk3000GDDGGJIFNCH.getDescriptor() });
        internal_static_Unk3000_ENLDIHLGNCK_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_Unk3000_ENLDIHLGNCK_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(Unk3000ENLDIHLGNCK.internal_static_Unk3000_ENLDIHLGNCK_descriptor, new String[] { "Unk3000CIOLEGEHDAC", "Unk3000NLFPKDOBNCD" });
        Unk3000GDDGGJIFNCH.getDescriptor();
    }
    
    public static final class Unk3000_ENLDIHLGNCK extends GeneratedMessageV3 implements Unk3000_ENLDIHLGNCKOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int UNK3000_CIOLEGEHDAC_FIELD_NUMBER = 3;
        private int unk3000CIOLEGEHDAC_;
        public static final int UNK3000_NLFPKDOBNCD_FIELD_NUMBER = 15;
        private List<Unk3000GDDGGJIFNCH.Unk3000_GDDGGJIFNCH> unk3000NLFPKDOBNCD_;
        private byte memoizedIsInitialized;
        private static final Unk3000_ENLDIHLGNCK DEFAULT_INSTANCE;
        private static final Parser<Unk3000_ENLDIHLGNCK> PARSER;
        
        private Unk3000_ENLDIHLGNCK(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private Unk3000_ENLDIHLGNCK() {
            this.memoizedIsInitialized = -1;
            this.unk3000NLFPKDOBNCD_ = Collections.emptyList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new Unk3000_ENLDIHLGNCK();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private Unk3000_ENLDIHLGNCK(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 24: {
                            this.unk3000CIOLEGEHDAC_ = input.readUInt32();
                            continue;
                        }
                        case 122: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.unk3000NLFPKDOBNCD_ = new ArrayList<Unk3000GDDGGJIFNCH.Unk3000_GDDGGJIFNCH>();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.unk3000NLFPKDOBNCD_.add(input.readMessage(Unk3000GDDGGJIFNCH.Unk3000_GDDGGJIFNCH.parser(), extensionRegistry));
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
                    this.unk3000NLFPKDOBNCD_ = Collections.unmodifiableList((List<? extends Unk3000GDDGGJIFNCH.Unk3000_GDDGGJIFNCH>)this.unk3000NLFPKDOBNCD_);
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return Unk3000ENLDIHLGNCK.internal_static_Unk3000_ENLDIHLGNCK_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return Unk3000ENLDIHLGNCK.internal_static_Unk3000_ENLDIHLGNCK_fieldAccessorTable.ensureFieldAccessorsInitialized(Unk3000_ENLDIHLGNCK.class, Builder.class);
        }
        
        @Override
        public int getUnk3000CIOLEGEHDAC() {
            return this.unk3000CIOLEGEHDAC_;
        }
        
        @Override
        public List<Unk3000GDDGGJIFNCH.Unk3000_GDDGGJIFNCH> getUnk3000NLFPKDOBNCDList() {
            return this.unk3000NLFPKDOBNCD_;
        }
        
        @Override
        public List<? extends Unk3000GDDGGJIFNCH.Unk3000_GDDGGJIFNCHOrBuilder> getUnk3000NLFPKDOBNCDOrBuilderList() {
            return this.unk3000NLFPKDOBNCD_;
        }
        
        @Override
        public int getUnk3000NLFPKDOBNCDCount() {
            return this.unk3000NLFPKDOBNCD_.size();
        }
        
        @Override
        public Unk3000GDDGGJIFNCH.Unk3000_GDDGGJIFNCH getUnk3000NLFPKDOBNCD(final int index) {
            return this.unk3000NLFPKDOBNCD_.get(index);
        }
        
        @Override
        public Unk3000GDDGGJIFNCH.Unk3000_GDDGGJIFNCHOrBuilder getUnk3000NLFPKDOBNCDOrBuilder(final int index) {
            return this.unk3000NLFPKDOBNCD_.get(index);
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
            if (this.unk3000CIOLEGEHDAC_ != 0) {
                output.writeUInt32(3, this.unk3000CIOLEGEHDAC_);
            }
            for (int i = 0; i < this.unk3000NLFPKDOBNCD_.size(); ++i) {
                output.writeMessage(15, this.unk3000NLFPKDOBNCD_.get(i));
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
            if (this.unk3000CIOLEGEHDAC_ != 0) {
                size += CodedOutputStream.computeUInt32Size(3, this.unk3000CIOLEGEHDAC_);
            }
            for (int i = 0; i < this.unk3000NLFPKDOBNCD_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(15, this.unk3000NLFPKDOBNCD_.get(i));
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Unk3000_ENLDIHLGNCK)) {
                return super.equals(obj);
            }
            final Unk3000_ENLDIHLGNCK other = (Unk3000_ENLDIHLGNCK)obj;
            return this.getUnk3000CIOLEGEHDAC() == other.getUnk3000CIOLEGEHDAC() && this.getUnk3000NLFPKDOBNCDList().equals(other.getUnk3000NLFPKDOBNCDList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 3;
            hash = 53 * hash + this.getUnk3000CIOLEGEHDAC();
            if (this.getUnk3000NLFPKDOBNCDCount() > 0) {
                hash = 37 * hash + 15;
                hash = 53 * hash + this.getUnk3000NLFPKDOBNCDList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static Unk3000_ENLDIHLGNCK parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return Unk3000_ENLDIHLGNCK.PARSER.parseFrom(data);
        }
        
        public static Unk3000_ENLDIHLGNCK parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return Unk3000_ENLDIHLGNCK.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static Unk3000_ENLDIHLGNCK parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return Unk3000_ENLDIHLGNCK.PARSER.parseFrom(data);
        }
        
        public static Unk3000_ENLDIHLGNCK parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return Unk3000_ENLDIHLGNCK.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static Unk3000_ENLDIHLGNCK parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return Unk3000_ENLDIHLGNCK.PARSER.parseFrom(data);
        }
        
        public static Unk3000_ENLDIHLGNCK parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return Unk3000_ENLDIHLGNCK.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static Unk3000_ENLDIHLGNCK parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(Unk3000_ENLDIHLGNCK.PARSER, input);
        }
        
        public static Unk3000_ENLDIHLGNCK parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(Unk3000_ENLDIHLGNCK.PARSER, input, extensionRegistry);
        }
        
        public static Unk3000_ENLDIHLGNCK parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(Unk3000_ENLDIHLGNCK.PARSER, input);
        }
        
        public static Unk3000_ENLDIHLGNCK parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(Unk3000_ENLDIHLGNCK.PARSER, input, extensionRegistry);
        }
        
        public static Unk3000_ENLDIHLGNCK parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(Unk3000_ENLDIHLGNCK.PARSER, input);
        }
        
        public static Unk3000_ENLDIHLGNCK parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(Unk3000_ENLDIHLGNCK.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return Unk3000_ENLDIHLGNCK.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final Unk3000_ENLDIHLGNCK prototype) {
            return Unk3000_ENLDIHLGNCK.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == Unk3000_ENLDIHLGNCK.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static Unk3000_ENLDIHLGNCK getDefaultInstance() {
            return Unk3000_ENLDIHLGNCK.DEFAULT_INSTANCE;
        }
        
        public static Parser<Unk3000_ENLDIHLGNCK> parser() {
            return Unk3000_ENLDIHLGNCK.PARSER;
        }
        
        @Override
        public Parser<Unk3000_ENLDIHLGNCK> getParserForType() {
            return Unk3000_ENLDIHLGNCK.PARSER;
        }
        
        @Override
        public Unk3000_ENLDIHLGNCK getDefaultInstanceForType() {
            return Unk3000_ENLDIHLGNCK.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new Unk3000_ENLDIHLGNCK();
            PARSER = new AbstractParser<Unk3000_ENLDIHLGNCK>() {
                @Override
                public Unk3000_ENLDIHLGNCK parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new Unk3000_ENLDIHLGNCK(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements Unk3000_ENLDIHLGNCKOrBuilder
        {
            private int bitField0_;
            private int unk3000CIOLEGEHDAC_;
            private List<Unk3000GDDGGJIFNCH.Unk3000_GDDGGJIFNCH> unk3000NLFPKDOBNCD_;
            private RepeatedFieldBuilderV3<Unk3000GDDGGJIFNCH.Unk3000_GDDGGJIFNCH, Unk3000GDDGGJIFNCH.Unk3000_GDDGGJIFNCH.Builder, Unk3000GDDGGJIFNCH.Unk3000_GDDGGJIFNCHOrBuilder> unk3000NLFPKDOBNCDBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return Unk3000ENLDIHLGNCK.internal_static_Unk3000_ENLDIHLGNCK_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return Unk3000ENLDIHLGNCK.internal_static_Unk3000_ENLDIHLGNCK_fieldAccessorTable.ensureFieldAccessorsInitialized(Unk3000_ENLDIHLGNCK.class, Builder.class);
            }
            
            private Builder() {
                this.unk3000NLFPKDOBNCD_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.unk3000NLFPKDOBNCD_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (Unk3000_ENLDIHLGNCK.alwaysUseFieldBuilders) {
                    this.getUnk3000NLFPKDOBNCDFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.unk3000CIOLEGEHDAC_ = 0;
                if (this.unk3000NLFPKDOBNCDBuilder_ == null) {
                    this.unk3000NLFPKDOBNCD_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                else {
                    this.unk3000NLFPKDOBNCDBuilder_.clear();
                }
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return Unk3000ENLDIHLGNCK.internal_static_Unk3000_ENLDIHLGNCK_descriptor;
            }
            
            @Override
            public Unk3000_ENLDIHLGNCK getDefaultInstanceForType() {
                return Unk3000_ENLDIHLGNCK.getDefaultInstance();
            }
            
            @Override
            public Unk3000_ENLDIHLGNCK build() {
                final Unk3000_ENLDIHLGNCK result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public Unk3000_ENLDIHLGNCK buildPartial() {
                final Unk3000_ENLDIHLGNCK result = new Unk3000_ENLDIHLGNCK(this);
                final int from_bitField0_ = this.bitField0_;
                result.unk3000CIOLEGEHDAC_ = this.unk3000CIOLEGEHDAC_;
                if (this.unk3000NLFPKDOBNCDBuilder_ == null) {
                    if ((this.bitField0_ & 0x1) != 0x0) {
                        this.unk3000NLFPKDOBNCD_ = Collections.unmodifiableList((List<? extends Unk3000GDDGGJIFNCH.Unk3000_GDDGGJIFNCH>)this.unk3000NLFPKDOBNCD_);
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    result.unk3000NLFPKDOBNCD_ = this.unk3000NLFPKDOBNCD_;
                }
                else {
                    result.unk3000NLFPKDOBNCD_ = this.unk3000NLFPKDOBNCDBuilder_.build();
                }
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
                if (other instanceof Unk3000_ENLDIHLGNCK) {
                    return this.mergeFrom((Unk3000_ENLDIHLGNCK)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final Unk3000_ENLDIHLGNCK other) {
                if (other == Unk3000_ENLDIHLGNCK.getDefaultInstance()) {
                    return this;
                }
                if (other.getUnk3000CIOLEGEHDAC() != 0) {
                    this.setUnk3000CIOLEGEHDAC(other.getUnk3000CIOLEGEHDAC());
                }
                if (this.unk3000NLFPKDOBNCDBuilder_ == null) {
                    if (!other.unk3000NLFPKDOBNCD_.isEmpty()) {
                        if (this.unk3000NLFPKDOBNCD_.isEmpty()) {
                            this.unk3000NLFPKDOBNCD_ = other.unk3000NLFPKDOBNCD_;
                            this.bitField0_ &= 0xFFFFFFFE;
                        }
                        else {
                            this.ensureUnk3000NLFPKDOBNCDIsMutable();
                            this.unk3000NLFPKDOBNCD_.addAll(other.unk3000NLFPKDOBNCD_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.unk3000NLFPKDOBNCD_.isEmpty()) {
                    if (this.unk3000NLFPKDOBNCDBuilder_.isEmpty()) {
                        this.unk3000NLFPKDOBNCDBuilder_.dispose();
                        this.unk3000NLFPKDOBNCDBuilder_ = null;
                        this.unk3000NLFPKDOBNCD_ = other.unk3000NLFPKDOBNCD_;
                        this.bitField0_ &= 0xFFFFFFFE;
                        this.unk3000NLFPKDOBNCDBuilder_ = (Unk3000_ENLDIHLGNCK.alwaysUseFieldBuilders ? this.getUnk3000NLFPKDOBNCDFieldBuilder() : null);
                    }
                    else {
                        this.unk3000NLFPKDOBNCDBuilder_.addAllMessages(other.unk3000NLFPKDOBNCD_);
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
                Unk3000_ENLDIHLGNCK parsedMessage = null;
                try {
                    parsedMessage = Unk3000_ENLDIHLGNCK.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (Unk3000_ENLDIHLGNCK)e.getUnfinishedMessage();
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
            public int getUnk3000CIOLEGEHDAC() {
                return this.unk3000CIOLEGEHDAC_;
            }
            
            public Builder setUnk3000CIOLEGEHDAC(final int value) {
                this.unk3000CIOLEGEHDAC_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearUnk3000CIOLEGEHDAC() {
                this.unk3000CIOLEGEHDAC_ = 0;
                this.onChanged();
                return this;
            }
            
            private void ensureUnk3000NLFPKDOBNCDIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.unk3000NLFPKDOBNCD_ = new ArrayList<Unk3000GDDGGJIFNCH.Unk3000_GDDGGJIFNCH>(this.unk3000NLFPKDOBNCD_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<Unk3000GDDGGJIFNCH.Unk3000_GDDGGJIFNCH> getUnk3000NLFPKDOBNCDList() {
                if (this.unk3000NLFPKDOBNCDBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends Unk3000GDDGGJIFNCH.Unk3000_GDDGGJIFNCH>)this.unk3000NLFPKDOBNCD_);
                }
                return this.unk3000NLFPKDOBNCDBuilder_.getMessageList();
            }
            
            @Override
            public int getUnk3000NLFPKDOBNCDCount() {
                if (this.unk3000NLFPKDOBNCDBuilder_ == null) {
                    return this.unk3000NLFPKDOBNCD_.size();
                }
                return this.unk3000NLFPKDOBNCDBuilder_.getCount();
            }
            
            @Override
            public Unk3000GDDGGJIFNCH.Unk3000_GDDGGJIFNCH getUnk3000NLFPKDOBNCD(final int index) {
                if (this.unk3000NLFPKDOBNCDBuilder_ == null) {
                    return this.unk3000NLFPKDOBNCD_.get(index);
                }
                return this.unk3000NLFPKDOBNCDBuilder_.getMessage(index);
            }
            
            public Builder setUnk3000NLFPKDOBNCD(final int index, final Unk3000GDDGGJIFNCH.Unk3000_GDDGGJIFNCH value) {
                if (this.unk3000NLFPKDOBNCDBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureUnk3000NLFPKDOBNCDIsMutable();
                    this.unk3000NLFPKDOBNCD_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.unk3000NLFPKDOBNCDBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setUnk3000NLFPKDOBNCD(final int index, final Unk3000GDDGGJIFNCH.Unk3000_GDDGGJIFNCH.Builder builderForValue) {
                if (this.unk3000NLFPKDOBNCDBuilder_ == null) {
                    this.ensureUnk3000NLFPKDOBNCDIsMutable();
                    this.unk3000NLFPKDOBNCD_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.unk3000NLFPKDOBNCDBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addUnk3000NLFPKDOBNCD(final Unk3000GDDGGJIFNCH.Unk3000_GDDGGJIFNCH value) {
                if (this.unk3000NLFPKDOBNCDBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureUnk3000NLFPKDOBNCDIsMutable();
                    this.unk3000NLFPKDOBNCD_.add(value);
                    this.onChanged();
                }
                else {
                    this.unk3000NLFPKDOBNCDBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addUnk3000NLFPKDOBNCD(final int index, final Unk3000GDDGGJIFNCH.Unk3000_GDDGGJIFNCH value) {
                if (this.unk3000NLFPKDOBNCDBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureUnk3000NLFPKDOBNCDIsMutable();
                    this.unk3000NLFPKDOBNCD_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.unk3000NLFPKDOBNCDBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addUnk3000NLFPKDOBNCD(final Unk3000GDDGGJIFNCH.Unk3000_GDDGGJIFNCH.Builder builderForValue) {
                if (this.unk3000NLFPKDOBNCDBuilder_ == null) {
                    this.ensureUnk3000NLFPKDOBNCDIsMutable();
                    this.unk3000NLFPKDOBNCD_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.unk3000NLFPKDOBNCDBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addUnk3000NLFPKDOBNCD(final int index, final Unk3000GDDGGJIFNCH.Unk3000_GDDGGJIFNCH.Builder builderForValue) {
                if (this.unk3000NLFPKDOBNCDBuilder_ == null) {
                    this.ensureUnk3000NLFPKDOBNCDIsMutable();
                    this.unk3000NLFPKDOBNCD_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.unk3000NLFPKDOBNCDBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllUnk3000NLFPKDOBNCD(final Iterable<? extends Unk3000GDDGGJIFNCH.Unk3000_GDDGGJIFNCH> values) {
                if (this.unk3000NLFPKDOBNCDBuilder_ == null) {
                    this.ensureUnk3000NLFPKDOBNCDIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.unk3000NLFPKDOBNCD_);
                    this.onChanged();
                }
                else {
                    this.unk3000NLFPKDOBNCDBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearUnk3000NLFPKDOBNCD() {
                if (this.unk3000NLFPKDOBNCDBuilder_ == null) {
                    this.unk3000NLFPKDOBNCD_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                    this.onChanged();
                }
                else {
                    this.unk3000NLFPKDOBNCDBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeUnk3000NLFPKDOBNCD(final int index) {
                if (this.unk3000NLFPKDOBNCDBuilder_ == null) {
                    this.ensureUnk3000NLFPKDOBNCDIsMutable();
                    this.unk3000NLFPKDOBNCD_.remove(index);
                    this.onChanged();
                }
                else {
                    this.unk3000NLFPKDOBNCDBuilder_.remove(index);
                }
                return this;
            }
            
            public Unk3000GDDGGJIFNCH.Unk3000_GDDGGJIFNCH.Builder getUnk3000NLFPKDOBNCDBuilder(final int index) {
                return this.getUnk3000NLFPKDOBNCDFieldBuilder().getBuilder(index);
            }
            
            @Override
            public Unk3000GDDGGJIFNCH.Unk3000_GDDGGJIFNCHOrBuilder getUnk3000NLFPKDOBNCDOrBuilder(final int index) {
                if (this.unk3000NLFPKDOBNCDBuilder_ == null) {
                    return this.unk3000NLFPKDOBNCD_.get(index);
                }
                return this.unk3000NLFPKDOBNCDBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends Unk3000GDDGGJIFNCH.Unk3000_GDDGGJIFNCHOrBuilder> getUnk3000NLFPKDOBNCDOrBuilderList() {
                if (this.unk3000NLFPKDOBNCDBuilder_ != null) {
                    return this.unk3000NLFPKDOBNCDBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends Unk3000GDDGGJIFNCH.Unk3000_GDDGGJIFNCHOrBuilder>)this.unk3000NLFPKDOBNCD_);
            }
            
            public Unk3000GDDGGJIFNCH.Unk3000_GDDGGJIFNCH.Builder addUnk3000NLFPKDOBNCDBuilder() {
                return this.getUnk3000NLFPKDOBNCDFieldBuilder().addBuilder(Unk3000GDDGGJIFNCH.Unk3000_GDDGGJIFNCH.getDefaultInstance());
            }
            
            public Unk3000GDDGGJIFNCH.Unk3000_GDDGGJIFNCH.Builder addUnk3000NLFPKDOBNCDBuilder(final int index) {
                return this.getUnk3000NLFPKDOBNCDFieldBuilder().addBuilder(index, Unk3000GDDGGJIFNCH.Unk3000_GDDGGJIFNCH.getDefaultInstance());
            }
            
            public List<Unk3000GDDGGJIFNCH.Unk3000_GDDGGJIFNCH.Builder> getUnk3000NLFPKDOBNCDBuilderList() {
                return this.getUnk3000NLFPKDOBNCDFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<Unk3000GDDGGJIFNCH.Unk3000_GDDGGJIFNCH, Unk3000GDDGGJIFNCH.Unk3000_GDDGGJIFNCH.Builder, Unk3000GDDGGJIFNCH.Unk3000_GDDGGJIFNCHOrBuilder> getUnk3000NLFPKDOBNCDFieldBuilder() {
                if (this.unk3000NLFPKDOBNCDBuilder_ == null) {
                    this.unk3000NLFPKDOBNCDBuilder_ = new RepeatedFieldBuilderV3<Unk3000GDDGGJIFNCH.Unk3000_GDDGGJIFNCH, Unk3000GDDGGJIFNCH.Unk3000_GDDGGJIFNCH.Builder, Unk3000GDDGGJIFNCH.Unk3000_GDDGGJIFNCHOrBuilder>(this.unk3000NLFPKDOBNCD_, (this.bitField0_ & 0x1) != 0x0, this.getParentForChildren(), this.isClean());
                    this.unk3000NLFPKDOBNCD_ = null;
                }
                return this.unk3000NLFPKDOBNCDBuilder_;
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
    
    public interface Unk3000_ENLDIHLGNCKOrBuilder extends MessageOrBuilder
    {
        int getUnk3000CIOLEGEHDAC();
        
        List<Unk3000GDDGGJIFNCH.Unk3000_GDDGGJIFNCH> getUnk3000NLFPKDOBNCDList();
        
        Unk3000GDDGGJIFNCH.Unk3000_GDDGGJIFNCH getUnk3000NLFPKDOBNCD(final int p0);
        
        int getUnk3000NLFPKDOBNCDCount();
        
        List<? extends Unk3000GDDGGJIFNCH.Unk3000_GDDGGJIFNCHOrBuilder> getUnk3000NLFPKDOBNCDOrBuilderList();
        
        Unk3000GDDGGJIFNCH.Unk3000_GDDGGJIFNCHOrBuilder getUnk3000NLFPKDOBNCDOrBuilder(final int p0);
    }
}
